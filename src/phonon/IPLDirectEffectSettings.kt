// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*
import java.lang.invoke.VarHandle

@JvmInline
public value class IPLDirectEffectSettings(
    public val `$mem`: MemorySegment,
) {
    public var numChannels: IPLint32
        get() = IPLDirectEffectSettings.numChannelsHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLDirectEffectSettings.numChannelsHandle.set(this.`$mem`, 0L, value)
        }

    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(IPLDirectEffectSettings.layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("numChannels"),
        ).withName("IPLDirectEffectSettings")

        @JvmField
        public val numChannelsHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("numChannels"))

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): IPLDirectEffectSettings =
            IPLDirectEffectSettings(alloc.allocate(IPLDirectEffectSettings.layout))
    }
}