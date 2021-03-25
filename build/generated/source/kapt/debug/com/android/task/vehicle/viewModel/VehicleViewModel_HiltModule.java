package com.android.task.vehicle.viewModel;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = VehicleViewModel.class
)
public interface VehicleViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.android.task.vehicle.viewModel.VehicleViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(VehicleViewModel_AssistedFactory factory);
}
