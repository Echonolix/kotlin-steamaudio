// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.VarHandle

@JvmInline
public value class IPLSimulationSharedInputs(
    public val `$mem`: MemorySegment,
) {
    public var listener: IPLCoordinateSpace3
        get() = IPLCoordinateSpace3(
            IPLSimulationSharedInputs.listenerHandle.invokeExact(
                this.`$mem`,
                0L
            ) as MemorySegment
        )
        set(`value`) {
            MemorySegment.copy(
                value.`$mem`, 0L, this.listener.`$mem`, 0L,
                IPLCoordinateSpace3.layout.byteSize()
            )
        }

    public var numRays: IPLint32
        get() = IPLSimulationSharedInputs.numRaysHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLSimulationSharedInputs.numRaysHandle.set(this.`$mem`, 0L, value)
        }

    public var numBounces: IPLint32
        get() = IPLSimulationSharedInputs.numBouncesHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLSimulationSharedInputs.numBouncesHandle.set(this.`$mem`, 0L, value)
        }

    public var duration: IPLfloat32
        get() = IPLSimulationSharedInputs.durationHandle.get(this.`$mem`, 0L) as Float
        set(`value`) {
            IPLSimulationSharedInputs.durationHandle.set(this.`$mem`, 0L, value)
        }

    public var order: IPLint32
        get() = IPLSimulationSharedInputs.orderHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLSimulationSharedInputs.orderHandle.set(this.`$mem`, 0L, value)
        }

    public var irradianceMinDistance: IPLfloat32
        get() = IPLSimulationSharedInputs.irradianceMinDistanceHandle.get(this.`$mem`, 0L) as Float
        set(`value`) {
            IPLSimulationSharedInputs.irradianceMinDistanceHandle.set(this.`$mem`, 0L, value)
        }

    public var pathingVisCallback: IPLPathingVisualizationCallback
        get() = IPLSimulationSharedInputs.pathingVisCallbackHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            IPLSimulationSharedInputs.pathingVisCallbackHandle.set(this.`$mem`, 0L, value)
        }

    public var pathingUserData: Pointer<Unit>
        get() = IPLSimulationSharedInputs.pathingUserDataHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            IPLSimulationSharedInputs.pathingUserDataHandle.set(this.`$mem`, 0L, value)
        }

    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(IPLSimulationSharedInputs.layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
            IPLCoordinateSpace3.layout.withName("listener"),
            ValueLayout.JAVA_INT.withName("numRays"),
            ValueLayout.JAVA_INT.withName("numBounces"),
            ValueLayout.JAVA_FLOAT.withName("duration"),
            ValueLayout.JAVA_INT.withName("order"),
            ValueLayout.JAVA_FLOAT.withName("irradianceMinDistance"),
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            `$RuntimeHelper`.POINTER.withName("pathingVisCallback"),
            `$RuntimeHelper`.POINTER.withName("pathingUserData"),
        ).withName("IPLSimulationSharedInputs")

        @JvmField
        public val listenerHandle: MethodHandle =
            layout.sliceHandle(MemoryLayout.PathElement.groupElement("listener"))

        @JvmField
        public val numRaysHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("numRays"))

        @JvmField
        public val numBouncesHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("numBounces"))

        @JvmField
        public val durationHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("duration"))

        @JvmField
        public val orderHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("order"))

        @JvmField
        public val irradianceMinDistanceHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("irradianceMinDistance"))

        @JvmField
        public val pathingVisCallbackHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("pathingVisCallback"))

        @JvmField
        public val pathingUserDataHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("pathingUserData"))

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): IPLSimulationSharedInputs =
            IPLSimulationSharedInputs(alloc.allocate(IPLSimulationSharedInputs.layout))

        public fun interface pathingVisCallback {
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
                        MethodHandles.lookup().unreflect(pathingVisCallback::class.java.methods.find {
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
    }
}
