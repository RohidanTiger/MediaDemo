package ht.qtstudio.base.utils

import android.content.Context
import ht.qtstudio.base.R

class DimensionUtils(private val context: Context) {
    val REACTION_BOARD_WIDTH: Int by lazy {
        (context.resources.getDimensionPixelSize(R.dimen.reaction_board_width)
                * context.resources.displayMetrics.density).toInt()
    }
}
