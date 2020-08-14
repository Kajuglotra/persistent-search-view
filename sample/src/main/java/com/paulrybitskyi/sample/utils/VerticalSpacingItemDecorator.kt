package com.paulrybitskyi.sample.utils

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

internal class VerticalSpacingItemDecorator(
    private val verticalSpacing: Int,
    private val verticalSpacingCompensation: Int
) : RecyclerView.ItemDecoration() {


    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val position = parent.getChildAdapterPosition(view)

        if (position != (parent.adapter!!.itemCount - 1)) {
            outRect.bottom = (verticalSpacing - verticalSpacingCompensation)
        } else {
            outRect.bottom = verticalSpacing
        }
    }


}
