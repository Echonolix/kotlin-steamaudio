// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*
import java.lang.invoke.MethodHandle

@JvmInline
public value class IPLSimulationOutputs(
    public val `$mem`: MemorySegment,
) {
    public var direct: IPLDirectEffectParams
        get() = IPLDirectEffectParams(
            IPLSimulationOutputs.directHandle.invokeExact(this.`$mem`, 0L) as
                    MemorySegment
        )
        set(`value`) {
            MemorySegment.copy(
                value.`$mem`, 0L, this.direct.`$mem`, 0L,
                IPLDirectEffectParams.layout.byteSize()
            )
        }

    public var reflections: IPLReflectionEffectParams
        get() =
            IPLReflectionEffectParams(
                IPLSimulationOutputs.reflectionsHandle.invokeExact(
                    this.`$mem`,
                    0L
                ) as MemorySegment
            )
        set(`value`) {
            MemorySegment.copy(
                value.`$mem`, 0L, this.reflections.`$mem`, 0L,
                IPLReflectionEffectParams.layout.byteSize()
            )
        }

    public var pathing: IPLPathEffectParams
        get() = IPLPathEffectParams(
            IPLSimulationOutputs.pathingHandle.invokeExact(this.`$mem`, 0L) as
                    MemorySegment
        )
        set(`value`) {
            MemorySegment.copy(
                value.`$mem`, 0L, this.pathing.`$mem`, 0L,
                IPLPathEffectParams.layout.byteSize()
            )
        }

    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(IPLSimulationOutputs.layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
            IPLDirectEffectParams.layout.withName("direct"),
            IPLReflectionEffectParams.layout.withName("reflections"),
            IPLPathEffectParams.layout.withName("pathing"),
            java.lang.foreign.MemoryLayout.paddingLayout(4),
        ).withName("IPLSimulationOutputs")

        @JvmField
        public val directHandle: MethodHandle =
            layout.sliceHandle(MemoryLayout.PathElement.groupElement("direct"))

        @JvmField
        public val reflectionsHandle: MethodHandle =
            layout.sliceHandle(MemoryLayout.PathElement.groupElement("reflections"))

        @JvmField
        public val pathingHandle: MethodHandle =
            layout.sliceHandle(MemoryLayout.PathElement.groupElement("pathing"))

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): IPLSimulationOutputs =
            IPLSimulationOutputs(alloc.allocate(IPLSimulationOutputs.layout))
    }
}
