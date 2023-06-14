package com.confidents.app.modules.splashscreen.ui

import androidx.activity.viewModels
import com.confidents.app.R
import com.confidents.app.appcomponents.base.BaseActivity
import com.confidents.app.databinding.ActivitySplashScreenBinding
import com.confidents.app.modules.splashscreen.`data`.viewmodel.SplashScreenVM
import kotlin.String
import kotlin.Unit

class SplashScreenActivity :
    BaseActivity<ActivitySplashScreenBinding>(R.layout.activity_splash_screen) {
  private val viewModel: SplashScreenVM by viewModels<SplashScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SPLASH_SCREEN_ACTIVITY"

  }
}
