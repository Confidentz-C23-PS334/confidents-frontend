package com.confidents.app.modules.faqs.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.confidents.app.R
import com.confidents.app.appcomponents.base.BaseActivity
import com.confidents.app.databinding.ActivityFaqsBinding
import com.confidents.app.modules.faqs.`data`.model.SpinnerGroupNineteenModel
import com.confidents.app.modules.faqs.`data`.model.SpinnerInputFieldModel
import com.confidents.app.modules.faqs.`data`.model.SpinnerInputFieldOneModel
import com.confidents.app.modules.faqs.`data`.model.SpinnerInputFieldTwoModel
import com.confidents.app.modules.faqs.`data`.viewmodel.FaqsVM
import kotlin.String
import kotlin.Unit

class FaqsActivity : BaseActivity<ActivityFaqsBinding>(R.layout.activity_faqs) {
  private val viewModel: FaqsVM by viewModels<FaqsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerInputFieldList.value = mutableListOf(
    SpinnerInputFieldModel("Item1"),
    SpinnerInputFieldModel("Item2"),
    SpinnerInputFieldModel("Item3"),
    SpinnerInputFieldModel("Item4"),
    SpinnerInputFieldModel("Item5")
    )
    val spinnerInputFieldAdapter =
    SpinnerInputFieldAdapter(this,R.layout.spinner_item,viewModel.spinnerInputFieldList.value?:
    mutableListOf())
    binding.spinnerInputField.adapter = spinnerInputFieldAdapter
    viewModel.spinnerInputFieldOneList.value = mutableListOf(
    SpinnerInputFieldOneModel("Item1"),
    SpinnerInputFieldOneModel("Item2"),
    SpinnerInputFieldOneModel("Item3"),
    SpinnerInputFieldOneModel("Item4"),
    SpinnerInputFieldOneModel("Item5")
    )
    val spinnerInputFieldOneAdapter =
    SpinnerInputFieldOneAdapter(this,R.layout.spinner_item,viewModel.spinnerInputFieldOneList.value?:
    mutableListOf())
    binding.spinnerInputFieldOne.adapter = spinnerInputFieldOneAdapter
    viewModel.spinnerGroupNineteenList.value = mutableListOf(
    SpinnerGroupNineteenModel("Item1"),
    SpinnerGroupNineteenModel("Item2"),
    SpinnerGroupNineteenModel("Item3"),
    SpinnerGroupNineteenModel("Item4"),
    SpinnerGroupNineteenModel("Item5")
    )
    val spinnerGroupNineteenAdapter =
    SpinnerGroupNineteenAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupNineteenList.value?:
    mutableListOf())
    binding.spinnerGroupNineteen.adapter = spinnerGroupNineteenAdapter
    viewModel.spinnerInputFieldTwoList.value = mutableListOf(
    SpinnerInputFieldTwoModel("Item1"),
    SpinnerInputFieldTwoModel("Item2"),
    SpinnerInputFieldTwoModel("Item3"),
    SpinnerInputFieldTwoModel("Item4"),
    SpinnerInputFieldTwoModel("Item5")
    )
    val spinnerInputFieldTwoAdapter =
    SpinnerInputFieldTwoAdapter(this,R.layout.spinner_item,viewModel.spinnerInputFieldTwoList.value?:
    mutableListOf())
    binding.spinnerInputFieldTwo.adapter = spinnerInputFieldTwoAdapter
    binding.faqsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "FAQS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FaqsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
