// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*
import java.lang.invoke.VarHandle

@JvmInline
public value class IPLAmbisonicsEncodeEffectSettings(
    public val `$mem`: MemorySegment,
) {
    public var maxOrder: IPLint32
        get() = IPLAmbisonicsEncodeEffectSettings.maxOrderHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLAmbisonicsEncodeEffectSettings.maxOrderHandle.set(this.`$mem`, 0L, value)
        }

    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(IPLAmbisonicsEncodeEffectSettings.layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("maxOrder"),
        ).withName("IPLAmbisonicsEncodeEffectSettings")

        @JvmField
        public val maxOrderHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("maxOrder"))

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): IPLAmbisonicsEncodeEffectSettings =
            IPLAmbisonicsEncodeEffectSettings(alloc.allocate(IPLAmbisonicsEncodeEffectSettings.layout))
    }
}
