package com.android.task.vehicle.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.task.domain.base.DomainResponse
import com.android.task.domain.model.VehicleModel
import com.android.task.vehicle.R
import com.android.task.vehicle.adapter.VehicleImageAdapter
import com.android.task.vehicle.databinding.FragmentVehicleDetailsBinding
import com.android.task.vehicle.viewModel.VehicleViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class VehicleDetailsFragment : Fragment(R.layout.fragment_vehicle_details) {

    private val viewModel: VehicleViewModel by viewModels()

    private lateinit var binding: FragmentVehicleDetailsBinding

    private lateinit var imageAdapter: VehicleImageAdapter

    private var position: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentVehicleDetailsBinding.inflate(layoutInflater, container, false)
        return binding.rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        position = arguments?.let {
            VehicleDetailsFragmentArgs.fromBundle(it).position
        } ?: throw IllegalArgumentException("Url must nor be null")

        viewModel.responseData.observe(viewLifecycleOwner) { renderContent(it) }
    }

    private fun renderContent(response: DomainResponse<List<VehicleModel>>) {
        when (response) {
            is DomainResponse.Content -> updateUI(response.result)

        }
    }

    private fun updateUI(list: List<VehicleModel>){
        val vehicle = list[position]
        if(vehicle.images != null){
            imageAdapter = VehicleImageAdapter(vehicle.images!!)
            binding.recyclerImages.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            binding.recyclerImages.adapter = imageAdapter
        }
        with(binding){
            txtMake.text = getString(R.string.make) + vehicle.make
            txtModel.text = getString(R.string.model) + vehicle.model
            txtPrice.text = getString(R.string.price) + vehicle.price
            txtMileage.text = getString(R.string.mileage) + vehicle.mileage
            txtFuel.text = getString(R.string.fuel) + vehicle.fuel
            txtDescription.text = getString(R.string.description) + vehicle.description
            if(vehicle.colour != null) txtColor.text = getString(R.string.colour) + vehicle.colour else txtColor.isVisible = false
        }
    }
}
