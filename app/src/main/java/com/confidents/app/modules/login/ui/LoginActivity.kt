package com.confidents.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.confidents.app.R
import com.confidents.app.appcomponents.base.BaseActivity
import com.confidents.app.appcomponents.googleauth.GoogleHelper
import com.confidents.app.databinding.ActivityLoginBinding
import com.confidents.app.modules.login.`data`.viewmodel.LoginVM
import com.confidents.app.modules.tos.ui.TosActivity
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearButton.setOnClickListener {
        googleLogin.login()
      }
      binding.btnLogIn.setOnClickListener {
        // TODO please, add your navigation code here
      }
      binding.txtConfirmation.setOnClickListener {
        val destIntent = TosActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "LOGIN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LoginActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
