package com.android.task.vehicle.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.android.task.data.base.BaseException
import com.android.task.data.base.domainResponse
import com.android.task.data.dto.toDomainModel
import com.android.task.domain.base.DomainResponse
import com.android.task.domain.interactors.GetVehicleNotesUseCase
import com.android.task.domain.interactors.GetVehiclesUseCase
import com.android.task.domain.model.VehicleModel
import com.android.task.domain.model.VehicleNoteModel
import com.android.task.vehicle.getVehicleList
import com.android.task.vehicle.getVehicleNoteList
import com.android.task.vehicle.rule.TestCoroutineRule
import com.android.task.vehicle.rule.mock
import com.android.task.vehicle.rule.whenever
import com.android.task.vehicle.viewModel.VehicleViewModel
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.RelaxedMockK
import junit.framework.Assert.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.ArgumentCaptor
import org.mockito.Mockito.*

@ExperimentalCoroutinesApi
class VehicleViewModelTest {

    @get:Rule
    var mainCoroutineRule = TestCoroutineRule()

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @RelaxedMockK
    private lateinit var mockException: BaseException

    private val getVehiclesUseCase = mock<GetVehiclesUseCase>()

    private val getVehicleNotesUseCase = mock<GetVehicleNotesUseCase>()

    private val observerVehiclesState = mock<Observer<DomainResponse<List<VehicleModel>>>>()

    private val observerVehicleNotesState = mock<Observer<DomainResponse<List<VehicleNoteModel>>>>()

    private val viewModel: VehicleViewModel by lazy {
        VehicleViewModel(getVehiclesUseCase, getVehicleNotesUseCase)
    }

    @Before
    fun setup() {
        MockKAnnotations.init(this)
        every { mockException.message } returns "Test Exception"
        viewModel.responseData.observeForever(observerVehiclesState)
        viewModel.responseNotes.observeForever(observerVehicleNotesState)
    }

    @Test
    @ExperimentalCoroutinesApi
    fun getVehiclesTest() = runBlocking {
        val response = getVehicleList().toDomainModel()
        whenever(getVehiclesUseCase.execute())
            .thenReturn(domainResponse { response })

        val argumentCaptor = ArgumentCaptor.forClass(DomainResponse::class.java)
        val success = DomainResponse.Content{response}
        val expectedDefaultState = DomainResponse.Loading
        argumentCaptor.run {
            verify(observerVehiclesState, times(1)).onChanged(capture() as DomainResponse<List<VehicleModel>>?)
            val (loadingState, defaultState) = Pair(success, DomainResponse.Loading)
            assertEquals(loadingState, success)
            assertEquals(defaultState, expectedDefaultState)
        }
    }

    @Test
    @ExperimentalCoroutinesApi
    fun getVehiclesNotesTest() = runBlocking {
        val response = getVehicleNoteList().toDomainModel()
        whenever(getVehicleNotesUseCase.execute())
            .thenReturn(domainResponse { response })

        val argumentCaptor = ArgumentCaptor.forClass(DomainResponse::class.java)
        val success = DomainResponse.Content{response}
        val expectedDefaultState = DomainResponse.Loading
        argumentCaptor.run {
            verify(observerVehicleNotesState, times(1)).onChanged(capture() as DomainResponse<List<VehicleNoteModel>>?)
            val (loadingState, defaultState) = Pair(success, DomainResponse.Loading)
            assertEquals(loadingState, success)
            assertEquals(defaultState, expectedDefaultState)
        }
    }
}