package com.confidents.app.modules.camera.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.confidents.app.R
import com.confidents.app.appcomponents.base.BaseActivity
import com.confidents.app.databinding.ActivityCameraBinding
import com.confidents.app.modules.camera.`data`.viewmodel.CameraVM
import com.confidents.app.modules.scanresult.ui.ScanResultActivity
import kotlin.String
import kotlin.Unit

class CameraActivity : BaseActivity<ActivityCameraBinding>(R.layout.activity_camera) {
  private val viewModel: CameraVM by viewModels<CameraVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cameraVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.image48531.setOnClickListener {
      val destIntent = ScanResultActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageFrame9976.setOnClickListener {
      val destIntent = ScanResultActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CAMERA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CameraActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
