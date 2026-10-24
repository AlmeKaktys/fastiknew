package com.melnikovaas.fastiknew.ui.theme.di

import com.melnikovaas.fastiknew.data.repository.SettingsRepositoryImpl
import com.melnikovaas.fastiknew.domain.repository.SettingsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Привязывает интерфейс к реализации: когда кому-то нужен SettingsRepository,
 * Hilt подставляет SettingsRepositoryImpl.
 * Если позже поменяем хранилище, достаточно заменить класс в этой строке.
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindSettingsRepository(
        impl: SettingsRepositoryImpl
    ): SettingsRepository
}