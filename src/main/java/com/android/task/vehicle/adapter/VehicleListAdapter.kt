package com.android.task.vehicle.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.task.domain.model.VehicleModel
import com.android.task.vehicle.R
import com.android.task.vehicle.databinding.VehicleListItemBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

internal typealias ItemClickAction = (Int) -> Unit

class VehicleListAdapter(private val itemClickAction: ItemClickAction)
: RecyclerView.Adapter<VehicleListAdapter.ItemViewHolder>() {

    private val itemList: MutableList<VehicleModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val vehicleListItemBinding = VehicleListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(vehicleListItemBinding)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(itemList[position])
        holder.itemView.setOnClickListener {
            itemClickAction(position)
        }
    }

    override fun getItemCount() = itemList.size

    fun updateData(vehicleList: List<VehicleModel>){
          itemList.clear()
          itemList.addAll(vehicleList)
          notifyDataSetChanged()
    }

    class ItemViewHolder(private val binding: VehicleListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(vehicle: VehicleModel) {
            with(binding) {
                Glide.with(binding.root)
                    .load(vehicle.images?.get(0)?.url)
                    .apply(RequestOptions().circleCrop())
                    .into(binding.imageView)
                txtMake.text = vehicle.make
                txtModel.text = root.context.getString(R.string.model) + vehicle.model
                txtPrice.text = root.context.getString(R.string.price) + vehicle.price
                txtFuel.text = root.context.getString(R.string.fuel) + vehicle.fuel
                if (vehicle.notes != null)
                    txtNote.text = root.context.getString(R.string.notes) + vehicle.notes
            }
        }
    }
}