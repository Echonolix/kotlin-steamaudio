// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*

@JvmInline
public value class _IPLAmbisonicsDecodeEffect_t(
    public val `$mem`: MemorySegment,
) {
    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(_IPLAmbisonicsDecodeEffect_t.layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
        ).withName("_IPLAmbisonicsDecodeEffect_t")

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): _IPLAmbisonicsDecodeEffect_t =
            _IPLAmbisonicsDecodeEffect_t(alloc.allocate(_IPLAmbisonicsDecodeEffect_t.layout))
    }
}
