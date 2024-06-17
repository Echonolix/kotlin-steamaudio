// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*
import java.lang.invoke.VarHandle

@JvmInline
public value class IPLTrueAudioNextDeviceSettings(
    public val `$mem`: MemorySegment,
) {
    public var frameSize: IPLint32
        get() = IPLTrueAudioNextDeviceSettings.frameSizeHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLTrueAudioNextDeviceSettings.frameSizeHandle.set(this.`$mem`, 0L, value)
        }

    public var irSize: IPLint32
        get() = IPLTrueAudioNextDeviceSettings.irSizeHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLTrueAudioNextDeviceSettings.irSizeHandle.set(this.`$mem`, 0L, value)
        }

    public var order: IPLint32
        get() = IPLTrueAudioNextDeviceSettings.orderHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLTrueAudioNextDeviceSettings.orderHandle.set(this.`$mem`, 0L, value)
        }

    public var maxSources: IPLint32
        get() = IPLTrueAudioNextDeviceSettings.maxSourcesHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLTrueAudioNextDeviceSettings.maxSourcesHandle.set(this.`$mem`, 0L, value)
        }

    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(IPLTrueAudioNextDeviceSettings.layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("frameSize"),
            ValueLayout.JAVA_INT.withName("irSize"),
            ValueLayout.JAVA_INT.withName("order"),
            ValueLayout.JAVA_INT.withName("maxSources"),
        ).withName("IPLTrueAudioNextDeviceSettings")

        @JvmField
        public val frameSizeHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("frameSize"))

        @JvmField
        public val irSizeHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("irSize"))

        @JvmField
        public val orderHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("order"))

        @JvmField
        public val maxSourcesHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("maxSources"))

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): IPLTrueAudioNextDeviceSettings =
            IPLTrueAudioNextDeviceSettings(alloc.allocate(IPLTrueAudioNextDeviceSettings.layout))
    }
}