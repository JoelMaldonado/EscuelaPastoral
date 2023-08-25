package com.jjmf.android.escuelapastoral.util

import android.content.Context
import android.widget.Toast

fun Context.show(msg:String?){
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}