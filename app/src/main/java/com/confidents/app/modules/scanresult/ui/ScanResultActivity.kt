package com.confidents.app.modules.scanresult.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.confidents.app.R
import com.confidents.app.appcomponents.base.BaseActivity
import com.confidents.app.databinding.ActivityScanResultBinding
import com.confidents.app.modules.history.ui.HistoryActivity
import com.confidents.app.modules.scanresult.`data`.viewmodel.ScanResultVM
import kotlin.String
import kotlin.Unit

class ScanResultActivity : BaseActivity<ActivityScanResultBinding>(R.layout.activity_scan_result) {
  private val viewModel: ScanResultVM by viewModels<ScanResultVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanResultVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = HistoryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCAN_RESULT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanResultActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
