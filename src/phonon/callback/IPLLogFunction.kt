package phonon.callback

import phonon.`$RuntimeHelper`
import phonon.IPLLogLevel
import phonon.Pointer
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles

public fun interface IPLLogFunction {
    public fun invoke(level: IPLLogLevel, message: Pointer<Byte>)

    public fun allocate(arena: Arena): MemorySegment =
        Linker.nativeLinker().upcallStub(invokeHandle.bindTo(this), fd, arena)

    public companion object {
        @JvmStatic
        public val invokeHandle: MethodHandle =
            MethodHandles.filterArguments(
                MethodHandles.lookup().unreflect(IPLLogFunction::class.java.methods.find {
                    it.name == "invoke"
                }
                ),
                1, IPLLogLevel.fromInt, null,
            )

        @JvmStatic
        public val fd: FunctionDescriptor = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            `$RuntimeHelper`.POINTER,
        )
    }
}
