// Generated by Dagger (https://dagger.dev).
package com.android.task.vehicle.di;

import com.android.task.data.repository.VehicleDataSource;
import com.android.task.domain.repository.VehicleRepositoryInterface;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepoModule_ProvideVehicleRepositoryFactory implements Factory<VehicleRepositoryInterface> {
  private final Provider<VehicleDataSource> vehicleDataSourceProvider;

  public RepoModule_ProvideVehicleRepositoryFactory(
      Provider<VehicleDataSource> vehicleDataSourceProvider) {
    this.vehicleDataSourceProvider = vehicleDataSourceProvider;
  }

  @Override
  public VehicleRepositoryInterface get() {
    return provideVehicleRepository(vehicleDataSourceProvider.get());
  }

  public static RepoModule_ProvideVehicleRepositoryFactory create(
      Provider<VehicleDataSource> vehicleDataSourceProvider) {
    return new RepoModule_ProvideVehicleRepositoryFactory(vehicleDataSourceProvider);
  }

  public static VehicleRepositoryInterface provideVehicleRepository(
      VehicleDataSource vehicleDataSource) {
    return Preconditions.checkNotNullFromProvides(RepoModule.INSTANCE.provideVehicleRepository(vehicleDataSource));
  }
}