package com.confidents.app.modules.scanresult.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.confidents.app.modules.scanresult.`data`.model.ScanResultModel
import org.koin.core.KoinComponent

class ScanResultVM : ViewModel(), KoinComponent {
  val scanResultModel: MutableLiveData<ScanResultModel> = MutableLiveData(ScanResultModel())

  var navArguments: Bundle? = null
}
