package phonon.callback

import phonon.*
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles

public fun interface IPLBatchedAnyHitCallback {
    public fun invoke(
        numRays: IPLint32,
        rays: Pointer<IPLRay>,
        minDistances: Pointer<IPLfloat32>,
        maxDistances: Pointer<IPLfloat32>,
        occluded: Pointer<IPLuint8>,
        userData: Pointer<Unit>,
    )

    public fun allocate(arena: Arena): MemorySegment =
        Linker.nativeLinker().upcallStub(invokeHandle.bindTo(this), fd, arena)

    public companion object {
        @JvmStatic
        public val invokeHandle: MethodHandle =
            MethodHandles.lookup().unreflect(IPLBatchedAnyHitCallback::class.java.methods.find {
                it.name == "invoke"
            }
            )

        @JvmStatic
        public val fd: FunctionDescriptor = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            `$RuntimeHelper`.POINTER,
            `$RuntimeHelper`.POINTER,
            `$RuntimeHelper`.POINTER,
            `$RuntimeHelper`.POINTER,
            `$RuntimeHelper`.POINTER,
        )
    }
}
