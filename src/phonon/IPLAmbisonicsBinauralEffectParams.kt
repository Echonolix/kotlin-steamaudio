// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*
import java.lang.invoke.VarHandle

@JvmInline
public value class IPLAmbisonicsBinauralEffectParams(
    public val `$mem`: MemorySegment,
) {
    public var hrtf: IPLHRTF
        get() = IPLAmbisonicsBinauralEffectParams.hrtfHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            IPLAmbisonicsBinauralEffectParams.hrtfHandle.set(this.`$mem`, 0L, value)
        }

    public var order: IPLint32
        get() = IPLAmbisonicsBinauralEffectParams.orderHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLAmbisonicsBinauralEffectParams.orderHandle.set(this.`$mem`, 0L, value)
        }

    public constructor(
        gc: Boolean
    ) : this(
        kotlin.run {
            require(gc) { "Do not call this if gc is not want" }
            Arena.ofAuto().allocate(IPLAmbisonicsBinauralEffectParams.layout)
        }
    )

    public companion object {
        public val layout: StructLayout =
            MemoryLayout.structLayout(
                `$RuntimeHelper`.POINTER.withName("hrtf"),
                ValueLayout.JAVA_INT.withName("order"),
                java.lang.foreign.MemoryLayout.paddingLayout(4),
            )
                .withName("IPLAmbisonicsBinauralEffectParams")

        @JvmField
        public val hrtfHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("hrtf"))

        @JvmField
        public val orderHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("order"))

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): IPLAmbisonicsBinauralEffectParams =
            IPLAmbisonicsBinauralEffectParams(
                alloc.allocate(IPLAmbisonicsBinauralEffectParams.layout)
            )
    }
}
