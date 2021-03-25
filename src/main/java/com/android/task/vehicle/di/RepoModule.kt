package com.android.task.vehicle.di

import com.android.task.data.repository.VehicleDataSource
import com.android.task.data.repository.VehicleRepositoryInterfaceImpl
import com.android.task.domain.interactors.GetVehiclesUseCase
import com.android.task.domain.repository.VehicleRepositoryInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object RepoModule {

    @Provides
    fun provideVehicleRepository(vehicleDataSource: VehicleDataSource): VehicleRepositoryInterface =
        VehicleRepositoryInterfaceImpl(vehicleDataSource)

    @Provides
    fun provideVehicleUseCase(repository: VehicleRepositoryInterface): GetVehiclesUseCase =
        GetVehiclesUseCase(
            repository
        )

}
