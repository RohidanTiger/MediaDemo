package ht.qtstudio.base.utils.networkdetection

data class ConnectionState(
    @ConnectionDef var type: Int,
    var isConnected: Boolean = false,
    var isFast: Boolean = false
)
