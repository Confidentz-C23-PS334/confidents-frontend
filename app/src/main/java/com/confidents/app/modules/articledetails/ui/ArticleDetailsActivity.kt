package com.confidents.app.modules.articledetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.confidents.app.R
import com.confidents.app.appcomponents.base.BaseActivity
import com.confidents.app.databinding.ActivityArticleDetailsBinding
import com.confidents.app.modules.articledetails.`data`.viewmodel.ArticleDetailsVM
import kotlin.String
import kotlin.Unit

class ArticleDetailsActivity :
    BaseActivity<ActivityArticleDetailsBinding>(R.layout.activity_article_details) {
  private val viewModel: ArticleDetailsVM by viewModels<ArticleDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.articleDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ARTICLE_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ArticleDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
