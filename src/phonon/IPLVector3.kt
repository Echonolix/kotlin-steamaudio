// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*
import java.lang.invoke.VarHandle

@JvmInline
public value class IPLVector3(
    public val `$mem`: MemorySegment,
) {
    public var x: IPLfloat32
        get() = IPLVector3.xHandle.get(this.`$mem`, 0L) as Float
        set(`value`) {
            IPLVector3.xHandle.set(this.`$mem`, 0L, value)
        }

    public var y: IPLfloat32
        get() = IPLVector3.yHandle.get(this.`$mem`, 0L) as Float
        set(`value`) {
            IPLVector3.yHandle.set(this.`$mem`, 0L, value)
        }

    public var z: IPLfloat32
        get() = IPLVector3.zHandle.get(this.`$mem`, 0L) as Float
        set(`value`) {
            IPLVector3.zHandle.set(this.`$mem`, 0L, value)
        }

    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(IPLVector3.layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_FLOAT.withName("x"),
            ValueLayout.JAVA_FLOAT.withName("y"),
            ValueLayout.JAVA_FLOAT.withName("z"),
        ).withName("IPLVector3")

        @JvmField
        public val xHandle: VarHandle = layout.varHandle(MemoryLayout.PathElement.groupElement("x"))

        @JvmField
        public val yHandle: VarHandle = layout.varHandle(MemoryLayout.PathElement.groupElement("y"))

        @JvmField
        public val zHandle: VarHandle = layout.varHandle(MemoryLayout.PathElement.groupElement("z"))

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): IPLVector3 =
            IPLVector3(alloc.allocate(IPLVector3.layout))
    }
}
