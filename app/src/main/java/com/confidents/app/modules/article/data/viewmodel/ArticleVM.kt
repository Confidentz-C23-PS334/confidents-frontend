package com.confidents.app.modules.article.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.confidents.app.modules.article.`data`.model.ArticleModel
import com.confidents.app.modules.article.`data`.model.Listassortmentofc1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ArticleVM : ViewModel(), KoinComponent {
  val articleModel: MutableLiveData<ArticleModel> = MutableLiveData(ArticleModel())

  var navArguments: Bundle? = null

  val listassortmentofcList: MutableLiveData<MutableList<Listassortmentofc1RowModel>> =
      MutableLiveData(mutableListOf())
}
