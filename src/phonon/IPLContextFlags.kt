// this file is auto generated by endoqa kotlin ffi, modify it with caution
package phonon

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int

public enum class IPLContextFlags(
    public val `value`: Int,
) {
    IPL_CONTEXTFLAGS_VALIDATION(0x00000001),
    IPL_CONTEXTFLAGS_FORCE_32BIT(0x7fffffff),
    ;

    public companion object {
        @JvmStatic
        public val fromInt: MethodHandle = MethodHandles.lookup().findStatic(
            IPLContextFlags::class.java,
            "fromInt",
            MethodType.methodType(IPLContextFlags::class.java, Int::class.java)
        )

        @JvmStatic
        public val toInt: MethodHandle = MethodHandles.lookup().findGetter(
            IPLContextFlags::class.java,
            "value",
            Int::class.java
        )

        @JvmStatic
        public fun fromInt(`value`: Int): IPLContextFlags = when (value) {
            0x00000001 -> IPL_CONTEXTFLAGS_VALIDATION
            0x7fffffff -> IPL_CONTEXTFLAGS_FORCE_32BIT
            else -> error("enum not found")
        }
    }
}
