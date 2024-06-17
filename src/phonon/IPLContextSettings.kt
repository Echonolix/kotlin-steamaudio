// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.VarHandle

@JvmInline
public value class IPLContextSettings(
    public val `$mem`: MemorySegment,
) {
    public var version: IPLuint32
        get() = (IPLContextSettings.versionHandle.get(this.`$mem`, 0L) as Int).toUInt()
        set(`value`) {
            IPLContextSettings.versionHandle.set(this.`$mem`, 0L, value.toInt())
        }

    public var logCallback: IPLLogFunction
        get() = IPLContextSettings.logCallbackHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            IPLContextSettings.logCallbackHandle.set(this.`$mem`, 0L, value)
        }

    public var allocateCallback: IPLAllocateFunction
        get() = IPLContextSettings.allocateCallbackHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            IPLContextSettings.allocateCallbackHandle.set(this.`$mem`, 0L, value)
        }

    public var freeCallback: IPLFreeFunction
        get() = IPLContextSettings.freeCallbackHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            IPLContextSettings.freeCallbackHandle.set(this.`$mem`, 0L, value)
        }

    public var simdLevel: IPLSIMDLevel
        get() = IPLSIMDLevel.fromInt(IPLContextSettings.simdLevelHandle.get(this.`$mem`, 0L) as Int)
        set(`value`) {
            IPLContextSettings.simdLevelHandle.set(this.`$mem`, 0L, value.value)
        }

    public var flags: IPLContextFlags
        get() = IPLContextFlags.fromInt(IPLContextSettings.flagsHandle.get(this.`$mem`, 0L) as Int)
        set(`value`) {
            IPLContextSettings.flagsHandle.set(this.`$mem`, 0L, value.value)
        }

    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(IPLContextSettings.layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("version"),
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            `$RuntimeHelper`.POINTER.withName("logCallback"),
            `$RuntimeHelper`.POINTER.withName("allocateCallback"),
            `$RuntimeHelper`.POINTER.withName("freeCallback"),
            ValueLayout.JAVA_INT.withName("simdLevel"),
            ValueLayout.JAVA_INT.withName("flags"),
        ).withName("IPLContextSettings")

        @JvmField
        public val versionHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("version"))

        @JvmField
        public val logCallbackHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("logCallback"))

        @JvmField
        public val allocateCallbackHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("allocateCallback"))

        @JvmField
        public val freeCallbackHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("freeCallback"))

        @JvmField
        public val simdLevelHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("simdLevel"))

        @JvmField
        public val flagsHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("flags"))

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): IPLContextSettings =
            IPLContextSettings(alloc.allocate(IPLContextSettings.layout))

        public fun interface logCallback {
            public fun invoke(level: IPLLogLevel, message: Pointer<Byte>)

            public fun allocate(arena: Arena): MemorySegment =
                Linker.nativeLinker().upcallStub(invokeHandle.bindTo(this), fd, arena)

            public companion object {
                @JvmStatic
                public val invokeHandle: MethodHandle =
                    MethodHandles.filterArguments(
                        MethodHandles.lookup().unreflect(logCallback::class.java.methods.find {
                            it.name == "invoke"
                        }
                        ),
                        1, IPLLogLevel.fromInt, null,
                    )

                @JvmStatic
                public val fd: FunctionDescriptor = FunctionDescriptor.ofVoid(
                    ValueLayout.JAVA_INT,
                    `$RuntimeHelper`.POINTER,
                )
            }
        }

        public fun interface allocateCallback {
            public fun invoke(size: IPLsize, alignment: IPLsize): Pointer<Unit>

            public fun allocate(arena: Arena): MemorySegment =
                Linker.nativeLinker().upcallStub(invokeHandle.bindTo(this), fd, arena)

            public companion object {
                @JvmStatic
                public val invokeHandle: MethodHandle =
                    MethodHandles.lookup().unreflect(allocateCallback::class.java.methods.find {
                        it.name == "invoke"
                    }
                    )

                @JvmStatic
                public val fd: FunctionDescriptor = FunctionDescriptor.of(
                    `$RuntimeHelper`.POINTER,
                    ValueLayout.JAVA_LONG,
                    ValueLayout.JAVA_LONG,
                )
            }
        }

        public fun interface freeCallback {
            public fun invoke(memoryBlock: Pointer<Unit>)

            public fun allocate(arena: Arena): MemorySegment =
                Linker.nativeLinker().upcallStub(invokeHandle.bindTo(this), fd, arena)

            public companion object {
                @JvmStatic
                public val invokeHandle: MethodHandle =
                    MethodHandles.lookup().unreflect(freeCallback::class.java.methods.find {
                        it.name == "invoke"
                    }
                    )

                @JvmStatic
                public val fd: FunctionDescriptor = FunctionDescriptor.ofVoid(
                    `$RuntimeHelper`.POINTER,
                )
            }
        }
    }
}
