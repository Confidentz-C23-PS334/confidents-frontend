package com.confidents.app.modules.settigns.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.confidents.app.modules.settigns.`data`.model.SettignsModel
import org.koin.core.KoinComponent

class SettignsVM : ViewModel(), KoinComponent {
  val settignsModel: MutableLiveData<SettignsModel> = MutableLiveData(SettignsModel())

  var navArguments: Bundle? = null
}
