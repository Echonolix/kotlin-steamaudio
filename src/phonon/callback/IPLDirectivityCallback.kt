package phonon.callback

import phonon.`$RuntimeHelper`
import phonon.IPLVector3
import phonon.Pointer
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles

public fun interface IPLDirectivityCallback {
    public fun invoke(direction: IPLVector3, userData: Pointer<Unit>): Float

    public fun allocate(arena: Arena): MemorySegment =
        Linker.nativeLinker().upcallStub(invokeHandle.bindTo(this), fd, arena)

    public companion object {
        @JvmStatic
        public val invokeHandle: MethodHandle =
            MethodHandles.lookup().unreflect(IPLDirectivityCallback::class.java.methods.find {
                it.name == "invoke"
            }
            )

        @JvmStatic
        public val fd: FunctionDescriptor = FunctionDescriptor.of(
            ValueLayout.JAVA_FLOAT,
            IPLVector3.layout,
            `$RuntimeHelper`.POINTER,
        )
    }
}
