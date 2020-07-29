package ht.qtstudio.base.utils

import android.content.Context
import ht.qtstudio.base.R

class DimensionUtils(private val context: Context, private val dimenRes: Int) {
    val REACTION_BOARD_WIDTH: Int by lazy {
        (context.resources.getDimensionPixelSize(dimenRes)
                * context.resources.displayMetrics.density).toInt()
    }
}
