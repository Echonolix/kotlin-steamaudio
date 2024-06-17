// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.VarHandle

@JvmInline
public value class IPLPathBakeParams(
    public val `$mem`: MemorySegment,
) {
    public var scene: IPLScene
        get() = IPLPathBakeParams.sceneHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            IPLPathBakeParams.sceneHandle.set(this.`$mem`, 0L, value)
        }

    public var probeBatch: IPLProbeBatch
        get() = IPLPathBakeParams.probeBatchHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            IPLPathBakeParams.probeBatchHandle.set(this.`$mem`, 0L, value)
        }

    public var identifier: IPLBakedDataIdentifier
        get() = IPLBakedDataIdentifier(
            IPLPathBakeParams.identifierHandle.invokeExact(this.`$mem`, 0L)
                    as MemorySegment
        )
        set(`value`) {
            MemorySegment.copy(
                value.`$mem`, 0L, this.identifier.`$mem`, 0L,
                IPLBakedDataIdentifier.layout.byteSize()
            )
        }

    public var numSamples: IPLint32
        get() = IPLPathBakeParams.numSamplesHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLPathBakeParams.numSamplesHandle.set(this.`$mem`, 0L, value)
        }

    public var radius: IPLfloat32
        get() = IPLPathBakeParams.radiusHandle.get(this.`$mem`, 0L) as Float
        set(`value`) {
            IPLPathBakeParams.radiusHandle.set(this.`$mem`, 0L, value)
        }

    public var threshold: IPLfloat32
        get() = IPLPathBakeParams.thresholdHandle.get(this.`$mem`, 0L) as Float
        set(`value`) {
            IPLPathBakeParams.thresholdHandle.set(this.`$mem`, 0L, value)
        }

    public var visRange: IPLfloat32
        get() = IPLPathBakeParams.visRangeHandle.get(this.`$mem`, 0L) as Float
        set(`value`) {
            IPLPathBakeParams.visRangeHandle.set(this.`$mem`, 0L, value)
        }

    public var pathRange: IPLfloat32
        get() = IPLPathBakeParams.pathRangeHandle.get(this.`$mem`, 0L) as Float
        set(`value`) {
            IPLPathBakeParams.pathRangeHandle.set(this.`$mem`, 0L, value)
        }

    public var numThreads: IPLint32
        get() = IPLPathBakeParams.numThreadsHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLPathBakeParams.numThreadsHandle.set(this.`$mem`, 0L, value)
        }

    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(IPLPathBakeParams.layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
            `$RuntimeHelper`.POINTER.withName("scene"),
            `$RuntimeHelper`.POINTER.withName("probeBatch"),
            IPLBakedDataIdentifier.layout.withName("identifier"),
            ValueLayout.JAVA_INT.withName("numSamples"),
            ValueLayout.JAVA_FLOAT.withName("radius"),
            ValueLayout.JAVA_FLOAT.withName("threshold"),
            ValueLayout.JAVA_FLOAT.withName("visRange"),
            ValueLayout.JAVA_FLOAT.withName("pathRange"),
            ValueLayout.JAVA_INT.withName("numThreads"),
        ).withName("IPLPathBakeParams")

        @JvmField
        public val sceneHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("scene"))

        @JvmField
        public val probeBatchHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("probeBatch"))

        @JvmField
        public val identifierHandle: MethodHandle =
            layout.sliceHandle(MemoryLayout.PathElement.groupElement("identifier"))

        @JvmField
        public val numSamplesHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("numSamples"))

        @JvmField
        public val radiusHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("radius"))

        @JvmField
        public val thresholdHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("threshold"))

        @JvmField
        public val visRangeHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("visRange"))

        @JvmField
        public val pathRangeHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("pathRange"))

        @JvmField
        public val numThreadsHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("numThreads"))

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): IPLPathBakeParams =
            IPLPathBakeParams(alloc.allocate(IPLPathBakeParams.layout))
    }
}