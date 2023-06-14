package com.confidents.app.modules.drlist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.confidents.app.modules.drlist.`data`.model.DrListModel
import com.confidents.app.modules.drlist.`data`.model.DrListRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DrListVM : ViewModel(), KoinComponent {
  val drListModel: MutableLiveData<DrListModel> = MutableLiveData(DrListModel())

  var navArguments: Bundle? = null

  val drListList: MutableLiveData<MutableList<DrListRowModel>> = MutableLiveData(mutableListOf())
}
