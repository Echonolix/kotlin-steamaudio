// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int

public enum class IPLBakedDataVariation(
    public val `value`: Int,
) {
    IPL_BAKEDDATAVARIATION_REVERB(0x00000000),
    IPL_BAKEDDATAVARIATION_STATICSOURCE(0x00000001),
    IPL_BAKEDDATAVARIATION_STATICLISTENER(0x00000002),
    IPL_BAKEDDATAVARIATION_DYNAMIC(0x00000003),
    ;

    public companion object {
        @JvmStatic
        public val fromInt: MethodHandle = MethodHandles.lookup().findStatic(
            IPLBakedDataVariation::class.java,
            "fromInt",
            MethodType.methodType(IPLBakedDataVariation::class.java, Int::class.java)
        )

        @JvmStatic
        public val toInt: MethodHandle = MethodHandles.lookup().findGetter(
            IPLBakedDataVariation::class.java,
            "value",
            Int::class.java
        )

        @JvmStatic
        public fun fromInt(`value`: Int): IPLBakedDataVariation = when (value) {
            0x00000000 -> IPL_BAKEDDATAVARIATION_REVERB
            0x00000001 -> IPL_BAKEDDATAVARIATION_STATICSOURCE
            0x00000002 -> IPL_BAKEDDATAVARIATION_STATICLISTENER
            0x00000003 -> IPL_BAKEDDATAVARIATION_DYNAMIC
            else -> error("enum not found")
        }
    }
}
