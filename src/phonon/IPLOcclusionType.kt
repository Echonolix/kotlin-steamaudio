// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int

public enum class IPLOcclusionType(
    public val `value`: Int,
) {
    IPL_OCCLUSIONTYPE_RAYCAST(0x00000000),
    IPL_OCCLUSIONTYPE_VOLUMETRIC(0x00000001),
    ;

    public companion object {
        @JvmStatic
        public val fromInt: MethodHandle = MethodHandles.lookup().findStatic(
            IPLOcclusionType::class.java,
            "fromInt",
            MethodType.methodType(IPLOcclusionType::class.java, Int::class.java)
        )

        @JvmStatic
        public val toInt: MethodHandle = MethodHandles.lookup().findGetter(
            IPLOcclusionType::class.java,
            "value",
            Int::class.java
        )

        @JvmStatic
        public fun fromInt(`value`: Int): IPLOcclusionType = when (value) {
            0x00000000 -> IPL_OCCLUSIONTYPE_RAYCAST
            0x00000001 -> IPL_OCCLUSIONTYPE_VOLUMETRIC
            else -> error("enum not found")
        }
    }
}
