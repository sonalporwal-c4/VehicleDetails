package com.android.task.vehicle.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0011\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/android/task/vehicle/viewModel/VehicleViewModel;", "Landroidx/lifecycle/ViewModel;", "getVehiclesUseCase", "Lcom/android/task/domain/interactors/GetVehiclesUseCase;", "getVehicleNotesUseCase", "Lcom/android/task/domain/interactors/GetVehicleNotesUseCase;", "(Lcom/android/task/domain/interactors/GetVehiclesUseCase;Lcom/android/task/domain/interactors/GetVehicleNotesUseCase;)V", "responseData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/android/task/domain/base/DomainResponse;", "", "Lcom/android/task/domain/model/VehicleModel;", "getResponseData", "()Landroidx/lifecycle/MutableLiveData;", "responseNotes", "Lcom/android/task/domain/model/VehicleNoteModel;", "getResponseNotes", "getVehicleData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVehicleNotes", "app_debug"})
public final class VehicleViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.android.task.domain.base.DomainResponse<java.util.List<com.android.task.domain.model.VehicleModel>>> responseData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.android.task.domain.base.DomainResponse<java.util.List<com.android.task.domain.model.VehicleNoteModel>>> responseNotes = null;
    private final com.android.task.domain.interactors.GetVehiclesUseCase getVehiclesUseCase = null;
    private final com.android.task.domain.interactors.GetVehicleNotesUseCase getVehicleNotesUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.android.task.domain.base.DomainResponse<java.util.List<com.android.task.domain.model.VehicleModel>>> getResponseData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.android.task.domain.base.DomainResponse<java.util.List<com.android.task.domain.model.VehicleNoteModel>>> getResponseNotes() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public VehicleViewModel(@org.jetbrains.annotations.NotNull()
    com.android.task.domain.interactors.GetVehiclesUseCase getVehiclesUseCase, @org.jetbrains.annotations.NotNull()
    com.android.task.domain.interactors.GetVehicleNotesUseCase getVehicleNotesUseCase) {
        super();
    }
}