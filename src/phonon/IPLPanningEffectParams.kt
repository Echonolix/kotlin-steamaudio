// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*
import java.lang.invoke.MethodHandle

@JvmInline
public value class IPLPanningEffectParams(
    public val `$mem`: MemorySegment,
) {
    public var direction: IPLVector3
        get() = IPLVector3(
            IPLPanningEffectParams.directionHandle.invokeExact(this.`$mem`, 0L) as
                    MemorySegment
        )
        set(`value`) {
            MemorySegment.copy(value.`$mem`, 0L, this.direction.`$mem`, 0L, IPLVector3.layout.byteSize())
        }

    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(IPLPanningEffectParams.layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
            IPLVector3.layout.withName("direction"),
        ).withName("IPLPanningEffectParams")

        @JvmField
        public val directionHandle: MethodHandle =
            layout.sliceHandle(MemoryLayout.PathElement.groupElement("direction"))

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): IPLPanningEffectParams =
            IPLPanningEffectParams(alloc.allocate(IPLPanningEffectParams.layout))
    }
}