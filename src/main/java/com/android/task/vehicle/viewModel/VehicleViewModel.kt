package com.android.task.vehicle.viewModel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.task.domain.base.DomainResponse
import com.android.task.domain.interactors.GetVehicleNotesUseCase
import com.android.task.domain.interactors.GetVehiclesUseCase
import com.android.task.domain.model.VehicleModel
import com.android.task.domain.model.VehicleNoteModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class VehicleViewModel @ViewModelInject constructor(
    private val getVehiclesUseCase: GetVehiclesUseCase,
    private val getVehicleNotesUseCase: GetVehicleNotesUseCase
) : ViewModel() {

    val responseData = MutableLiveData<DomainResponse<List<VehicleModel>>>()

    val responseNotes = MutableLiveData<DomainResponse<List<VehicleNoteModel>>>()

    init {
        viewModelScope.launch {
            getVehicleData()
            getVehicleNotes()
        }
    }


    private suspend fun getVehicleData() = responseData.postValue(getVehiclesUseCase.execute())

    private suspend fun getVehicleNotes() = responseNotes.postValue(getVehicleNotesUseCase.execute())

}
