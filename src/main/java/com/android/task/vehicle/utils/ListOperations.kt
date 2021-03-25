package com.android.task.vehicle.utils

import com.android.task.domain.model.VehicleModel
import com.android.task.domain.model.VehicleNoteModel

class ListOperations {

    companion object {

        @JvmStatic
        fun merge(
            vehicleList: List<VehicleModel>,
            notesList: List<VehicleNoteModel>
        ): List<VehicleModel> {
            return vehicleList.mapNotNull { vehicle ->
                val notes = notesList.find { it.vehicleId == vehicle.id }
                if (notes == null) vehicle
                else {
                    VehicleModel(
                        id = vehicle.id,
                        make = vehicle.make,
                        model = vehicle.model,
                        colour = vehicle.colour,
                        price = vehicle.price,
                        firstRegistration = vehicle.firstRegistration,
                        mileage = vehicle.mileage,
                        fuel = vehicle.fuel,
                        seller = vehicle.seller,
                        images = vehicle.images,
                        description = vehicle.description,
                        notes = notes.note
                    )
                }
            }
        }
    }
}