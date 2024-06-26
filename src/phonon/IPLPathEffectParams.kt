// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.VarHandle

@JvmInline
public value class IPLPathEffectParams(
    public val `$mem`: MemorySegment,
) {
    public val eqCoeffs: NativeArray<IPLfloat32>
        get() = IPLPathEffectParams.eqCoeffsHandle.invokeExact(this.`$mem`, 0L) as MemorySegment

    public var shCoeffs: Pointer<IPLfloat32>
        get() = IPLPathEffectParams.shCoeffsHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            IPLPathEffectParams.shCoeffsHandle.set(this.`$mem`, 0L, value)
        }

    public var order: IPLint32
        get() = IPLPathEffectParams.orderHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLPathEffectParams.orderHandle.set(this.`$mem`, 0L, value)
        }

    public var binaural: IPLbool
        get() = IPLbool.fromInt(IPLPathEffectParams.binauralHandle.get(this.`$mem`, 0L) as Int)
        set(`value`) {
            IPLPathEffectParams.binauralHandle.set(this.`$mem`, 0L, value.value)
        }

    public var hrtf: IPLHRTF
        get() = IPLPathEffectParams.hrtfHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            IPLPathEffectParams.hrtfHandle.set(this.`$mem`, 0L, value)
        }

    public var listener: IPLCoordinateSpace3
        get() = IPLCoordinateSpace3(
            IPLPathEffectParams.listenerHandle.invokeExact(this.`$mem`, 0L) as
                    MemorySegment
        )
        set(`value`) {
            MemorySegment.copy(
                value.`$mem`, 0L, this.listener.`$mem`, 0L,
                IPLCoordinateSpace3.layout.byteSize()
            )
        }

    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(IPLPathEffectParams.layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3L, ValueLayout.JAVA_FLOAT).withName("eqCoeffs"),
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            `$RuntimeHelper`.POINTER.withName("shCoeffs"),
            ValueLayout.JAVA_INT.withName("order"),
            ValueLayout.JAVA_INT.withName("binaural"),
            `$RuntimeHelper`.POINTER.withName("hrtf"),
            IPLCoordinateSpace3.layout.withName("listener"),
        ).withName("IPLPathEffectParams")

        @JvmField
        public val eqCoeffsHandle: MethodHandle =
            layout.sliceHandle(MemoryLayout.PathElement.groupElement("eqCoeffs"))

        @JvmField
        public val shCoeffsHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("shCoeffs"))

        @JvmField
        public val orderHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("order"))

        @JvmField
        public val binauralHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("binaural"))

        @JvmField
        public val hrtfHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("hrtf"))

        @JvmField
        public val listenerHandle: MethodHandle =
            layout.sliceHandle(MemoryLayout.PathElement.groupElement("listener"))

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): IPLPathEffectParams =
            IPLPathEffectParams(alloc.allocate(IPLPathEffectParams.layout))
    }
}
