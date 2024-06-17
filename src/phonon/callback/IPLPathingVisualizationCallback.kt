package phonon.callback

import phonon.`$RuntimeHelper`
import phonon.IPLVector3
import phonon.IPLbool
import phonon.Pointer
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles

public fun interface IPLPathingVisualizationCallback {
    public fun invoke(
        from: IPLVector3,
        to: IPLVector3,
        occluded: IPLbool,
        userData: Pointer<Unit>,
    )

    public fun allocate(arena: Arena): MemorySegment =
        Linker.nativeLinker().upcallStub(invokeHandle.bindTo(this), fd, arena)

    public companion object {
        @JvmStatic
        public val invokeHandle: MethodHandle =
            MethodHandles.filterArguments(
                MethodHandles.lookup().unreflect(IPLPathingVisualizationCallback::class.java.methods.find {
                    it.name == "invoke"
                }
                ),
                1, null, null, IPLbool.fromInt, null,
            )

        @JvmStatic
        public val fd: FunctionDescriptor = FunctionDescriptor.ofVoid(
            IPLVector3.layout,
            IPLVector3.layout,
            ValueLayout.JAVA_INT,
            `$RuntimeHelper`.POINTER,
        )
    }
}
