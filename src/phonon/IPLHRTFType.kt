// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int

public enum class IPLHRTFType(
    public val `value`: Int,
) {
    IPL_HRTFTYPE_DEFAULT(0x00000000),
    IPL_HRTFTYPE_SOFA(0x00000001),
    ;

    public companion object {
        @JvmStatic
        public val fromInt: MethodHandle = MethodHandles.lookup().findStatic(
            IPLHRTFType::class.java,
            "fromInt",
            MethodType.methodType(IPLHRTFType::class.java, Int::class.java)
        )

        @JvmStatic
        public val toInt: MethodHandle = MethodHandles.lookup().findGetter(
            IPLHRTFType::class.java,
            "value",
            Int::class.java
        )

        @JvmStatic
        public fun fromInt(`value`: Int): IPLHRTFType = when (value) {
            0x00000000 -> IPL_HRTFTYPE_DEFAULT
            0x00000001 -> IPL_HRTFTYPE_SOFA
            else -> error("enum not found")
        }
    }
}