package com.confidents.app.modules.tos.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.confidents.app.modules.tos.`data`.model.TosModel
import org.koin.core.KoinComponent

class TosVM : ViewModel(), KoinComponent {
  val tosModel: MutableLiveData<TosModel> = MutableLiveData(TosModel())

  var navArguments: Bundle? = null
}
