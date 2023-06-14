package com.confidents.app.modules.article.`data`.model

import com.confidents.app.R
import com.confidents.app.appcomponents.di.MyApp
import kotlin.String

data class ArticleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArticles: String? = MyApp.getInstance().resources.getString(R.string.lbl_articles)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularArticle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_popular_article)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFitness: String? = MyApp.getInstance().resources.getString(R.string.lbl_teeth_care)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrendingArticl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_trending_articl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRelatedArticle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_related_article)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeallOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchValue: String? = null
)
