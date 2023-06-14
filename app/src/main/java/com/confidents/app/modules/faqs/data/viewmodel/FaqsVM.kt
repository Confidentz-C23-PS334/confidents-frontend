package com.confidents.app.modules.faqs.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.confidents.app.modules.faqs.`data`.model.FaqsModel
import com.confidents.app.modules.faqs.`data`.model.SpinnerGroupNineteenModel
import com.confidents.app.modules.faqs.`data`.model.SpinnerInputFieldModel
import com.confidents.app.modules.faqs.`data`.model.SpinnerInputFieldOneModel
import com.confidents.app.modules.faqs.`data`.model.SpinnerInputFieldTwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FaqsVM : ViewModel(), KoinComponent {
  val faqsModel: MutableLiveData<FaqsModel> = MutableLiveData(FaqsModel())

  var navArguments: Bundle? = null

  val spinnerInputFieldList: MutableLiveData<MutableList<SpinnerInputFieldModel>> =
      MutableLiveData()

  val spinnerInputFieldOneList: MutableLiveData<MutableList<SpinnerInputFieldOneModel>> =
      MutableLiveData()

  val spinnerGroupNineteenList: MutableLiveData<MutableList<SpinnerGroupNineteenModel>> =
      MutableLiveData()

  val spinnerInputFieldTwoList: MutableLiveData<MutableList<SpinnerInputFieldTwoModel>> =
      MutableLiveData()
}
