// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int

public enum class IPLAudioEffectState(
    public val `value`: Int,
) {
    IPL_AUDIOEFFECTSTATE_TAILREMAINING(0x00000000),
    IPL_AUDIOEFFECTSTATE_TAILCOMPLETE(0x00000001),
    ;

    public companion object {
        @JvmStatic
        public val fromInt: MethodHandle = MethodHandles.lookup().findStatic(
            IPLAudioEffectState::class.java,
            "fromInt",
            MethodType.methodType(IPLAudioEffectState::class.java, Int::class.java)
        )

        @JvmStatic
        public val toInt: MethodHandle = MethodHandles.lookup().findGetter(
            IPLAudioEffectState::class.java,
            "value",
            Int::class.java
        )

        @JvmStatic
        public fun fromInt(`value`: Int): IPLAudioEffectState = when (value) {
            0x00000000 -> IPL_AUDIOEFFECTSTATE_TAILREMAINING
            0x00000001 -> IPL_AUDIOEFFECTSTATE_TAILCOMPLETE
            else -> error("enum not found")
        }
    }
}