// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*
import java.lang.invoke.VarHandle

@JvmInline
public value class IPLAmbisonicsPanningEffectParams(
    public val `$mem`: MemorySegment,
) {
    public var order: IPLint32
        get() = IPLAmbisonicsPanningEffectParams.orderHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLAmbisonicsPanningEffectParams.orderHandle.set(this.`$mem`, 0L, value)
        }

    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(IPLAmbisonicsPanningEffectParams.layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("order"),
        ).withName("IPLAmbisonicsPanningEffectParams")

        @JvmField
        public val orderHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("order"))

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): IPLAmbisonicsPanningEffectParams =
            IPLAmbisonicsPanningEffectParams(alloc.allocate(IPLAmbisonicsPanningEffectParams.layout))
    }
}