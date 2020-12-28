package com.example.djay

import android.content.Context
import androidx.multidex.MultiDexApplication
import com.secneo.sdk.Helper

class MApplication : MultiDexApplication() {
    override fun attachBaseContext(paramContext: Context) {
        super.attachBaseContext(paramContext)
        Helper.install(this@MApplication)
    }
}