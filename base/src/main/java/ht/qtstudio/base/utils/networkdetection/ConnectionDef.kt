package ht.qtstudio.base.utils.networkdetection

import androidx.annotation.IntDef
import ht.qtstudio.base.utils.networkdetection.ConnectionDef.Companion.MOBILE_DATA
import ht.qtstudio.base.utils.networkdetection.ConnectionDef.Companion.NO_CONNECTION
import ht.qtstudio.base.utils.networkdetection.ConnectionDef.Companion.WIFI_DATA

@Retention(AnnotationRetention.SOURCE)
@IntDef(NO_CONNECTION, WIFI_DATA, MOBILE_DATA)
annotation class ConnectionDef {
    companion object {
        const val NO_CONNECTION = -1
        const val WIFI_DATA = 0
        const val MOBILE_DATA = 1
    }
}
