package com.bugfender.samplekotlin

import android.app.Application
import com.bugfender.sdk.Bugfender

class App : Application() {

    val bugfenderApplicationKey: String = "app-key" // TODO: Insert to application-key here!

    override fun onCreate() {
        super.onCreate()

        Bugfender.init(this, bugfenderApplicationKey, BuildConfig.DEBUG)
        Bugfender.enableUIEventLogging(this)
        Bugfender.getDeviceIdentifier()
    }
}

