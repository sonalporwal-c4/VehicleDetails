package com.android.task.vehicle.views

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

data class VehicleDetailsFragmentArgs(
  val position: Int
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("position", this.position)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): VehicleDetailsFragmentArgs {
      bundle.setClassLoader(VehicleDetailsFragmentArgs::class.java.classLoader)
      val __position : Int
      if (bundle.containsKey("position")) {
        __position = bundle.getInt("position")
      } else {
        throw IllegalArgumentException("Required argument \"position\" is missing and does not have an android:defaultValue")
      }
      return VehicleDetailsFragmentArgs(__position)
    }
  }
}
