package com.confidents.app.modules.reminder.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.confidents.app.modules.reminder.`data`.model.ReminderModel
import org.koin.core.KoinComponent

class ReminderVM : ViewModel(), KoinComponent {
  val reminderModel: MutableLiveData<ReminderModel> = MutableLiveData(ReminderModel())

  var navArguments: Bundle? = null
}
