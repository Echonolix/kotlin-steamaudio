package phonon.callback

import phonon.`$RuntimeHelper`
import phonon.IPLsize
import phonon.Pointer
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles

public fun interface IPLAllocateFunction {
    public fun invoke(size: IPLsize, alignment: IPLsize): Pointer<Unit>

    public fun allocate(arena: Arena): MemorySegment =
        Linker.nativeLinker().upcallStub(invokeHandle.bindTo(this), fd, arena)

    public companion object {
        @JvmStatic
        public val invokeHandle: MethodHandle =
            MethodHandles.lookup().unreflect(IPLAllocateFunction::class.java.methods.find {
                it.name == "invoke"
            }
            )

        @JvmStatic
        public val fd: FunctionDescriptor = FunctionDescriptor.of(
            `$RuntimeHelper`.POINTER,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
        )
    }
}
