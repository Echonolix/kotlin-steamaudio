// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int

public enum class IPLDirectEffectFlags(
    public val `value`: Int,
) {
    IPL_DIRECTEFFECTFLAGS_APPLYDISTANCEATTENUATION(0x00000001),
    IPL_DIRECTEFFECTFLAGS_APPLYAIRABSORPTION(0x00000002),
    IPL_DIRECTEFFECTFLAGS_APPLYDIRECTIVITY(0x00000004),
    IPL_DIRECTEFFECTFLAGS_APPLYOCCLUSION(0x00000008),
    IPL_DIRECTEFFECTFLAGS_APPLYTRANSMISSION(0x00000010),
    ;

    public companion object {
        @JvmStatic
        public val fromInt: MethodHandle = MethodHandles.lookup().findStatic(
            IPLDirectEffectFlags::class.java,
            "fromInt",
            MethodType.methodType(IPLDirectEffectFlags::class.java, Int::class.java)
        )

        @JvmStatic
        public val toInt: MethodHandle = MethodHandles.lookup().findGetter(
            IPLDirectEffectFlags::class.java,
            "value",
            Int::class.java
        )

        @JvmStatic
        public fun fromInt(`value`: Int): IPLDirectEffectFlags = when (value) {
            0x00000001 -> IPL_DIRECTEFFECTFLAGS_APPLYDISTANCEATTENUATION
            0x00000002 -> IPL_DIRECTEFFECTFLAGS_APPLYAIRABSORPTION
            0x00000004 -> IPL_DIRECTEFFECTFLAGS_APPLYDIRECTIVITY
            0x00000008 -> IPL_DIRECTEFFECTFLAGS_APPLYOCCLUSION
            0x00000010 -> IPL_DIRECTEFFECTFLAGS_APPLYTRANSMISSION
            else -> error("enum not found")
        }
    }
}