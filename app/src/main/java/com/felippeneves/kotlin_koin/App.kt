package com.felippeneves.kotlin_koin

import android.app.Application
import com.felippeneves.kotlin_koin.di.module.appModule
import com.felippeneves.kotlin_koin.di.module.repoModule
import com.felippeneves.kotlin_koin.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}
