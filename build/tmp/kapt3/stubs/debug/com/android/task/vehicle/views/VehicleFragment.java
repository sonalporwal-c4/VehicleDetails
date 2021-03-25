package com.android.task.vehicle.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0017J\u001c\u0010\u001f\u001a\u00020\b2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"0!H\u0002J\u001c\u0010#\u001a\u00020\b2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\"0!H\u0002J\u001c\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\'2\b\b\u0002\u0010(\u001a\u00020\'H\u0002J&\u0010)\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\'2\b\b\u0002\u0010(\u001a\u00020\'2\b\b\u0002\u0010*\u001a\u00020\'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006+"}, d2 = {"Lcom/android/task/vehicle/views/VehicleFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/android/task/vehicle/databinding/FragmentVehicleBinding;", "itemClickAction", "Lkotlin/Function1;", "", "", "Lcom/android/task/vehicle/adapter/ItemClickAction;", "vehicleListAdapter", "Lcom/android/task/vehicle/adapter/VehicleListAdapter;", "vehicleModelList", "", "Lcom/android/task/domain/model/VehicleModel;", "viewModel", "Lcom/android/task/vehicle/viewModel/VehicleViewModel;", "getViewModel", "()Lcom/android/task/vehicle/viewModel/VehicleViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "renderContent", "response", "Lcom/android/task/domain/base/DomainResponse;", "", "renderNotes", "Lcom/android/task/domain/model/VehicleNoteModel;", "setNotesViewState", "failure", "", "load", "setViewState", "content", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class VehicleFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.android.task.vehicle.databinding.FragmentVehicleBinding binding;
    private com.android.task.vehicle.adapter.VehicleListAdapter vehicleListAdapter;
    private final java.util.List<com.android.task.domain.model.VehicleModel> vehicleModelList = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> itemClickAction = null;
    
    private final com.android.task.vehicle.viewModel.VehicleViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void renderContent(com.android.task.domain.base.DomainResponse<? extends java.util.List<com.android.task.domain.model.VehicleModel>> response) {
    }
    
    private final void renderNotes(com.android.task.domain.base.DomainResponse<? extends java.util.List<com.android.task.domain.model.VehicleNoteModel>> response) {
    }
    
    private final void setViewState(boolean failure, boolean load, boolean content) {
    }
    
    private final void setNotesViewState(boolean failure, boolean load) {
    }
    
    public VehicleFragment() {
        super();
    }
}