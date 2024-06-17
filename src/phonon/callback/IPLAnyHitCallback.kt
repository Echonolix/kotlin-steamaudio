package phonon.callback

import phonon.*
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles

public fun interface IPLAnyHitCallback {
    public fun invoke(
        ray: Pointer<IPLRay>,
        minDistance: IPLfloat32,
        maxDistance: IPLfloat32,
        occluded: Pointer<IPLuint8>,
        userData: Pointer<Unit>,
    )

    public fun allocate(arena: Arena): MemorySegment =
        Linker.nativeLinker().upcallStub(invokeHandle.bindTo(this), fd, arena)

    public companion object {
        @JvmStatic
        public val invokeHandle: MethodHandle =
            MethodHandles.lookup().unreflect(IPLAnyHitCallback::class.java.methods.find {
                it.name == "invoke"
            }
            )

        @JvmStatic
        public val fd: FunctionDescriptor = FunctionDescriptor.ofVoid(
            `$RuntimeHelper`.POINTER,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            `$RuntimeHelper`.POINTER,
            `$RuntimeHelper`.POINTER,
        )
    }
}
