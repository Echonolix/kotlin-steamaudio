// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int

public enum class IPLOpenCLDeviceType(
    public val `value`: Int,
) {
    IPL_OPENCLDEVICETYPE_ANY(0x00000000),
    IPL_OPENCLDEVICETYPE_CPU(0x00000001),
    IPL_OPENCLDEVICETYPE_GPU(0x00000002),
    ;

    public companion object {
        @JvmStatic
        public val fromInt: MethodHandle = MethodHandles.lookup().findStatic(
            IPLOpenCLDeviceType::class.java,
            "fromInt",
            MethodType.methodType(IPLOpenCLDeviceType::class.java, Int::class.java)
        )

        @JvmStatic
        public val toInt: MethodHandle = MethodHandles.lookup().findGetter(
            IPLOpenCLDeviceType::class.java,
            "value",
            Int::class.java
        )

        @JvmStatic
        public fun fromInt(`value`: Int): IPLOpenCLDeviceType = when (value) {
            0x00000000 -> IPL_OPENCLDEVICETYPE_ANY
            0x00000001 -> IPL_OPENCLDEVICETYPE_CPU
            0x00000002 -> IPL_OPENCLDEVICETYPE_GPU
            else -> error("enum not found")
        }
    }
}
