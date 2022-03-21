package com.felippeneves.kotlin_koin.di.module

import com.felippeneves.kotlin_koin.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single {
        MainRepository(get())
    }
}