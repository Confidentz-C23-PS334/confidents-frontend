package com.confidents.app.modules.settigns.ui

import androidx.activity.viewModels
import com.confidents.app.R
import com.confidents.app.appcomponents.base.BaseActivity
import com.confidents.app.databinding.ActivitySettignsBinding
import com.confidents.app.modules.camera.ui.CameraActivity
import com.confidents.app.modules.faqs.ui.FaqsActivity
import com.confidents.app.modules.help.ui.HelpActivity
import com.confidents.app.modules.history.ui.HistoryActivity
import com.confidents.app.modules.settigns.`data`.viewmodel.SettignsVM
import kotlin.String
import kotlin.Unit

class SettignsActivity : BaseActivity<ActivitySettignsBinding>(R.layout.activity_settigns) {
  private val viewModel: SettignsVM by viewModels<SettignsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.settignsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowrightTwo.setOnClickListener {
      val destIntent = HelpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHistory.setOnClickListener {
      val destIntent = HistoryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = CameraActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowrightOne.setOnClickListener {
      val destIntent = FaqsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SETTIGNS_ACTIVITY"

  }
}
