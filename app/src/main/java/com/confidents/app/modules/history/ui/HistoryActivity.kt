package com.confidents.app.modules.history.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.confidents.app.R
import com.confidents.app.appcomponents.base.BaseActivity
import com.confidents.app.databinding.ActivityHistoryBinding
import com.confidents.app.modules.history.`data`.viewmodel.HistoryVM
import com.confidents.app.modules.scanresult.ui.ScanResultActivity
import kotlin.String
import kotlin.Unit

class HistoryActivity : BaseActivity<ActivityHistoryBinding>(R.layout.activity_history) {
  private val viewModel: HistoryVM by viewModels<HistoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.historyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearColumn.setOnClickListener {
      val destIntent = ScanResultActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HISTORY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HistoryActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
