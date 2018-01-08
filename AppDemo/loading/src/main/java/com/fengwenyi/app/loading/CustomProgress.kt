package com.fengwenyi.app.loading

import android.content.Context
import android.util.AttributeSet
import android.widget.ProgressBar

/**
 * @author Wenyi Feng
 */
class CustomProgress : ProgressBar {

    constructor(context: Context) : super(context)
    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet)
    constructor(context: Context, attributeSet: AttributeSet, defStyle : Int)
            : super(context, attributeSet, defStyle)

}