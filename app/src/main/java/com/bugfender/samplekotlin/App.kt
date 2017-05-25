package com.bugfender.samplekotlin

import android.app.Application
import com.bugfender.sdk.Bugfender

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        Bugfender.init(this, "<YOUR APP KEY>", BuildConfig.DEBUG)
        Bugfender.enableUIEventLogging(this)
        Bugfender.getDeviceIdentifier()
    }
}

