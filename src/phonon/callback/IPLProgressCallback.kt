package phonon.callback

import phonon.`$RuntimeHelper`
import phonon.IPLfloat32
import phonon.Pointer
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles

public fun interface IPLProgressCallback {
    public fun invoke(progress: IPLfloat32, userData: Pointer<Unit>)

    public fun allocate(arena: Arena): MemorySegment =
        Linker.nativeLinker().upcallStub(invokeHandle.bindTo(this), fd, arena)

    public companion object {
        @JvmStatic
        public val invokeHandle: MethodHandle =
            MethodHandles.lookup().unreflect(IPLProgressCallback::class.java.methods.find {
                it.name == "invoke"
            }
            )

        @JvmStatic
        public val fd: FunctionDescriptor = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_FLOAT,
            `$RuntimeHelper`.POINTER,
        )
    }
}
