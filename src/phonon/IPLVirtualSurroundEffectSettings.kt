// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.VarHandle

@JvmInline
public value class IPLVirtualSurroundEffectSettings(
    public val `$mem`: MemorySegment,
) {
    public var speakerLayout: IPLSpeakerLayout
        get() =
            IPLSpeakerLayout(
                IPLVirtualSurroundEffectSettings.speakerLayoutHandle.invokeExact(
                    this.`$mem`,
                    0L
                ) as MemorySegment
            )
        set(`value`) {
            MemorySegment.copy(
                value.`$mem`, 0L, this.speakerLayout.`$mem`, 0L,
                IPLSpeakerLayout.layout.byteSize()
            )
        }

    public var hrtf: IPLHRTF
        get() = IPLVirtualSurroundEffectSettings.hrtfHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            IPLVirtualSurroundEffectSettings.hrtfHandle.set(this.`$mem`, 0L, value)
        }

    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(IPLVirtualSurroundEffectSettings.layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
            IPLSpeakerLayout.layout.withName("speakerLayout"),
            `$RuntimeHelper`.POINTER.withName("hrtf"),
        ).withName("IPLVirtualSurroundEffectSettings")

        @JvmField
        public val speakerLayoutHandle: MethodHandle =
            layout.sliceHandle(MemoryLayout.PathElement.groupElement("speakerLayout"))

        @JvmField
        public val hrtfHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("hrtf"))

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): IPLVirtualSurroundEffectSettings =
            IPLVirtualSurroundEffectSettings(alloc.allocate(IPLVirtualSurroundEffectSettings.layout))
    }
}
