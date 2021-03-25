package com.android.task.vehicle.views

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.task.domain.base.DomainResponse
import com.android.task.domain.model.VehicleModel
import com.android.task.domain.model.VehicleNoteModel
import com.android.task.vehicle.adapter.ItemClickAction
import com.android.task.vehicle.adapter.VehicleListAdapter
import com.android.task.vehicle.databinding.FragmentVehicleBinding
import com.android.task.vehicle.utils.ListOperations
import com.android.task.vehicle.viewModel.VehicleViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class VehicleFragment : Fragment() {

    private val viewModel: VehicleViewModel by viewModels()

    private lateinit var binding: FragmentVehicleBinding

    private lateinit var  vehicleListAdapter: VehicleListAdapter

    private val vehicleModelList: MutableList<VehicleModel> = mutableListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentVehicleBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vehicleListAdapter = VehicleListAdapter(itemClickAction)
        binding.recycler.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = vehicleListAdapter
        }
        viewModel.responseData.observe(viewLifecycleOwner) { renderContent(it) }

        viewModel.responseNotes.observe(viewLifecycleOwner) { renderNotes(it) }
    }


    private fun renderContent(response: DomainResponse<List<VehicleModel>>) {
        when (response) {
            is DomainResponse.Loading -> setViewState(load = true)
            is DomainResponse.Content -> {
                vehicleModelList.clear()
                vehicleModelList.addAll(response.result)
                setViewState(content = true)
                vehicleListAdapter.updateData(vehicleModelList)
            }
            is DomainResponse.Error -> setViewState(failure = true)
        }
    }

    private fun renderNotes(response: DomainResponse<List<VehicleNoteModel>>) {
        when (response) {
            is DomainResponse.Loading -> setNotesViewState(load = true)
            is DomainResponse.Content -> {
                vehicleListAdapter.updateData(ListOperations.merge(vehicleModelList, response.result))
            }
            is DomainResponse.Error -> setNotesViewState(failure = true)
        }
    }

    private fun setViewState(failure: Boolean = false, load: Boolean = false, content: Boolean = false) {
        with(binding) {
            loading.isVisible = load
            errorLayout.root.isVisible = failure
            recycler.isVisible = content
        }
    }

    private fun setNotesViewState(failure: Boolean = false, load: Boolean = false) {
        with(binding) {
            notesLoading.isVisible = load
            notesErrorLayout.root.isVisible = failure
        }
    }

    private val itemClickAction: ItemClickAction = { position ->
        val action = VehicleFragmentDirections.showVehicleDetailsAction(position)
        Navigation.findNavController(binding.rootView).navigate(action)
    }

}
