// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*

@JvmInline
public value class _IPLSource_t(
    public val `$mem`: MemorySegment,
) {
    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(_IPLSource_t.layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
        ).withName("_IPLSource_t")

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): _IPLSource_t =
            _IPLSource_t(alloc.allocate(_IPLSource_t.layout))
    }
}
