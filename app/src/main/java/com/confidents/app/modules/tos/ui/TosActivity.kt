package com.confidents.app.modules.tos.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.confidents.app.R
import com.confidents.app.appcomponents.base.BaseActivity
import com.confidents.app.databinding.ActivityTosBinding
import com.confidents.app.modules.signup.ui.SignupActivity
import com.confidents.app.modules.tos.`data`.viewmodel.TosVM
import kotlin.String
import kotlin.Unit

class TosActivity : BaseActivity<ActivityTosBinding>(R.layout.activity_tos) {
  private val viewModel: TosVM by viewModels<TosVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TOS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TosActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
