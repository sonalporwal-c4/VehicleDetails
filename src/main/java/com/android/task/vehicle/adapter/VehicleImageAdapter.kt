package com.android.task.vehicle.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.task.domain.model.ImageModel
import com.android.task.vehicle.databinding.VehicleImageItemBinding
import com.bumptech.glide.Glide


class VehicleImageAdapter(private val images: List<ImageModel>) : RecyclerView.Adapter<VehicleImageAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val vehicleImageItemBinding = VehicleImageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(vehicleImageItemBinding)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
      holder.bind(images[position])
    }

    override fun getItemCount() = images.size

    class ItemViewHolder(private val binding: VehicleImageItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(image: ImageModel) {
            Glide.with(binding.root)
                .load(image.url)
                .into(binding.imageView)
        }
    }


}