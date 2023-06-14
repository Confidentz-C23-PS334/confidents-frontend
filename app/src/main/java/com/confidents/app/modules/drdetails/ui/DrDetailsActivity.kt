package com.confidents.app.modules.drdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.confidents.app.R
import com.confidents.app.appcomponents.base.BaseActivity
import com.confidents.app.databinding.ActivityDrDetailsBinding
import com.confidents.app.modules.drdetails.`data`.viewmodel.DrDetailsVM
import kotlin.String
import kotlin.Unit

class DrDetailsActivity : BaseActivity<ActivityDrDetailsBinding>(R.layout.activity_dr_details) {
  private val viewModel: DrDetailsVM by viewModels<DrDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.drDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DR_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DrDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
