package com.confidents.app.modules.reminder.ui

import androidx.fragment.app.viewModels
import com.confidents.app.R
import com.confidents.app.appcomponents.base.BaseFragment
import com.confidents.app.appcomponents.views.TimePickerFragment
import com.confidents.app.databinding.FragmentReminderBinding
import com.confidents.app.modules.reminder.`data`.viewmodel.ReminderVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class ReminderFragment : BaseFragment<FragmentReminderBinding>(R.layout.fragment_reminder) {
  private val viewModel: ReminderVM by viewModels<ReminderVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.reminderVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowclockTwo.setOnClickListener {
      val destinationInstance = TimePickerFragment.getInstance()
      destinationInstance.show(requireActivity().supportFragmentManager, TimePickerFragment.TAG) {
          selectedTime ->
        onTimeSelectedLinearRowclockTwo(selectedTime)
      }
    }
  }

  private fun onTimeSelectedLinearRowclockTwo(selectedTime: Date) {
  }

  companion object {
    const val TAG: String = "REMINDER_FRAGMENT"

  }
}
