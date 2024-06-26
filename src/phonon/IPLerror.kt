// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int

public enum class IPLerror(
    public val `value`: Int,
) {
    IPL_STATUS_SUCCESS(0x00000000),
    IPL_STATUS_FAILURE(0x00000001),
    IPL_STATUS_OUTOFMEMORY(0x00000002),
    IPL_STATUS_INITIALIZATION(0x00000003),
    ;

    public companion object {
        @JvmStatic
        public val fromInt: MethodHandle = MethodHandles.lookup().findStatic(
            IPLerror::class.java,
            "fromInt",
            MethodType.methodType(IPLerror::class.java, Int::class.java)
        )

        @JvmStatic
        public val toInt: MethodHandle = MethodHandles.lookup().findGetter(
            IPLerror::class.java,
            "value",
            Int::class.java
        )

        @JvmStatic
        public fun fromInt(`value`: Int): IPLerror = when (value) {
            0x00000000 -> IPL_STATUS_SUCCESS
            0x00000001 -> IPL_STATUS_FAILURE
            0x00000002 -> IPL_STATUS_OUTOFMEMORY
            0x00000003 -> IPL_STATUS_INITIALIZATION
            else -> error("enum not found")
        }
    }
}
