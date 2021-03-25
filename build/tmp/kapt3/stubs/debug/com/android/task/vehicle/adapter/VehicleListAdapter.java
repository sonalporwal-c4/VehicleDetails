package com.android.task.vehicle.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0014\u0010\u0014\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/android/task/vehicle/adapter/VehicleListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/android/task/vehicle/adapter/VehicleListAdapter$ItemViewHolder;", "itemClickAction", "Lkotlin/Function1;", "", "", "Lcom/android/task/vehicle/adapter/ItemClickAction;", "(Lkotlin/jvm/functions/Function1;)V", "itemList", "", "Lcom/android/task/domain/model/VehicleModel;", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "vehicleList", "", "ItemViewHolder", "app_debug"})
public final class VehicleListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.android.task.vehicle.adapter.VehicleListAdapter.ItemViewHolder> {
    private final java.util.List<com.android.task.domain.model.VehicleModel> itemList = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> itemClickAction = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.android.task.vehicle.adapter.VehicleListAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.android.task.vehicle.adapter.VehicleListAdapter.ItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.task.domain.model.VehicleModel> vehicleList) {
    }
    
    public VehicleListAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> itemClickAction) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/android/task/vehicle/adapter/VehicleListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/android/task/vehicle/databinding/VehicleListItemBinding;", "(Lcom/android/task/vehicle/databinding/VehicleListItemBinding;)V", "bind", "", "vehicle", "Lcom/android/task/domain/model/VehicleModel;", "app_debug"})
    public static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.android.task.vehicle.databinding.VehicleListItemBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.android.task.domain.model.VehicleModel vehicle) {
        }
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.android.task.vehicle.databinding.VehicleListItemBinding binding) {
            super(null);
        }
    }
}