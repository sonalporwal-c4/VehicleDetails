package com.android.task.vehicle.views

import android.os.Bundle
import androidx.navigation.NavDirections
import com.android.task.vehicle.R
import kotlin.Int

class VehicleFragmentDirections private constructor() {
  private data class ShowVehicleDetailsAction(
    val position: Int
  ) : NavDirections {
    override fun getActionId(): Int = R.id.show_vehicle_details_action

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("position", this.position)
      return result
    }
  }

  companion object {
    fun showVehicleDetailsAction(position: Int): NavDirections = ShowVehicleDetailsAction(position)
  }
}
