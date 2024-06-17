// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*
import java.lang.invoke.VarHandle

@JvmInline
public value class IPLStaticMeshSettings(
    public val `$mem`: MemorySegment,
) {
    public var numVertices: IPLint32
        get() = IPLStaticMeshSettings.numVerticesHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLStaticMeshSettings.numVerticesHandle.set(this.`$mem`, 0L, value)
        }

    public var numTriangles: IPLint32
        get() = IPLStaticMeshSettings.numTrianglesHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLStaticMeshSettings.numTrianglesHandle.set(this.`$mem`, 0L, value)
        }

    public var numMaterials: IPLint32
        get() = IPLStaticMeshSettings.numMaterialsHandle.get(this.`$mem`, 0L) as Int
        set(`value`) {
            IPLStaticMeshSettings.numMaterialsHandle.set(this.`$mem`, 0L, value)
        }

    public var vertices: Pointer<IPLVector3>
        get() = IPLStaticMeshSettings.verticesHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            IPLStaticMeshSettings.verticesHandle.set(this.`$mem`, 0L, value)
        }

    public var triangles: Pointer<IPLTriangle>
        get() = IPLStaticMeshSettings.trianglesHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            IPLStaticMeshSettings.trianglesHandle.set(this.`$mem`, 0L, value)
        }

    public var materialIndices: Pointer<IPLint32>
        get() = IPLStaticMeshSettings.materialIndicesHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            IPLStaticMeshSettings.materialIndicesHandle.set(this.`$mem`, 0L, value)
        }

    public var materials: Pointer<IPLMaterial>
        get() = IPLStaticMeshSettings.materialsHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            IPLStaticMeshSettings.materialsHandle.set(this.`$mem`, 0L, value)
        }

    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(IPLStaticMeshSettings.layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("numVertices"),
            ValueLayout.JAVA_INT.withName("numTriangles"),
            ValueLayout.JAVA_INT.withName("numMaterials"),
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            `$RuntimeHelper`.POINTER.withName("vertices"),
            `$RuntimeHelper`.POINTER.withName("triangles"),
            `$RuntimeHelper`.POINTER.withName("materialIndices"),
            `$RuntimeHelper`.POINTER.withName("materials"),
        ).withName("IPLStaticMeshSettings")

        @JvmField
        public val numVerticesHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("numVertices"))

        @JvmField
        public val numTrianglesHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("numTriangles"))

        @JvmField
        public val numMaterialsHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("numMaterials"))

        @JvmField
        public val verticesHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("vertices"))

        @JvmField
        public val trianglesHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("triangles"))

        @JvmField
        public val materialIndicesHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("materialIndices"))

        @JvmField
        public val materialsHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("materials"))

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): IPLStaticMeshSettings =
            IPLStaticMeshSettings(alloc.allocate(IPLStaticMeshSettings.layout))
    }
}
