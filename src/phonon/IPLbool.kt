// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int

public enum class IPLbool(
    public val `value`: Int,
) {
    IPL_FALSE(0x00000000),
    IPL_TRUE(0x00000001),
    ;

    public companion object {
        @JvmStatic
        public val fromInt: MethodHandle = MethodHandles.lookup().findStatic(
            IPLbool::class.java,
            "fromInt",
            MethodType.methodType(IPLbool::class.java, Int::class.java)
        )

        @JvmStatic
        public val toInt: MethodHandle = MethodHandles.lookup().findGetter(
            IPLbool::class.java,
            "value",
            Int::class.java
        )

        @JvmStatic
        public fun fromInt(`value`: Int): IPLbool = when (value) {
            0x00000000 -> IPL_FALSE
            0x00000001 -> IPL_TRUE
            else -> error("enum not found")
        }
    }
}
