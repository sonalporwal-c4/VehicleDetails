package com.android.task.vehicle.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/android/task/vehicle/di/RepoModule;", "", "()V", "provideVehicleRepository", "Lcom/android/task/domain/repository/VehicleRepositoryInterface;", "vehicleDataSource", "Lcom/android/task/data/repository/VehicleDataSource;", "provideVehicleUseCase", "Lcom/android/task/domain/interactors/GetVehiclesUseCase;", "repository", "app_debug"})
@dagger.Module()
public final class RepoModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.task.vehicle.di.RepoModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.android.task.domain.repository.VehicleRepositoryInterface provideVehicleRepository(@org.jetbrains.annotations.NotNull()
    com.android.task.data.repository.VehicleDataSource vehicleDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.android.task.domain.interactors.GetVehiclesUseCase provideVehicleUseCase(@org.jetbrains.annotations.NotNull()
    com.android.task.domain.repository.VehicleRepositoryInterface repository) {
        return null;
    }
    
    private RepoModule() {
        super();
    }
}