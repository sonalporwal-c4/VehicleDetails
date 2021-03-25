package com.android.task.vehicle.viewModel;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.android.task.domain.interactors.GetVehicleNotesUseCase;
import com.android.task.domain.interactors.GetVehiclesUseCase;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class VehicleViewModel_AssistedFactory implements ViewModelAssistedFactory<VehicleViewModel> {
  private final Provider<GetVehiclesUseCase> getVehiclesUseCase;

  private final Provider<GetVehicleNotesUseCase> getVehicleNotesUseCase;

  @Inject
  VehicleViewModel_AssistedFactory(Provider<GetVehiclesUseCase> getVehiclesUseCase,
      Provider<GetVehicleNotesUseCase> getVehicleNotesUseCase) {
    this.getVehiclesUseCase = getVehiclesUseCase;
    this.getVehicleNotesUseCase = getVehicleNotesUseCase;
  }

  @Override
  @NonNull
  public VehicleViewModel create(SavedStateHandle handle) {
    return new VehicleViewModel(getVehiclesUseCase.get(), getVehicleNotesUseCase.get());
  }
}
