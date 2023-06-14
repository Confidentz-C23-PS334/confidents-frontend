package com.confidents.app.modules.article.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.confidents.app.R
import com.confidents.app.appcomponents.base.BaseFragment
import com.confidents.app.databinding.FragmentArticleBinding
import com.confidents.app.modules.article.`data`.model.Listassortmentofc1RowModel
import com.confidents.app.modules.article.`data`.viewmodel.ArticleVM
import com.confidents.app.modules.articledetails.ui.ArticleDetailsActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ArticleFragment : BaseFragment<FragmentArticleBinding>(R.layout.fragment_article) {
  private val viewModel: ArticleVM by viewModels<ArticleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listassortmentofcAdapter =
    ListassortmentofcAdapter(viewModel.listassortmentofcList.value?:mutableListOf())
    binding.recyclerListassortmentofc.adapter = listassortmentofcAdapter
    listassortmentofcAdapter.setOnItemClickListener(
    object : ListassortmentofcAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listassortmentofc1RowModel) {
        onClickRecyclerListassortmentofc(view, position, item)
      }
    }
    )
    viewModel.listassortmentofcList.observe(requireActivity()) {
      listassortmentofcAdapter.updateData(it)
    }
    binding.articleVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
    }
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
    binding.recyclerTrendings.setOnClickListener {
      val destIntent = ArticleDetailsActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerListassortmentofc(
    view: View,
    position: Int,
    item: Listassortmentofc1RowModel
  ): Unit {
    when(view.id) {
      R.id.linearArticle ->  {
        onClickRecyclerListassortmentofcLinearArticle(view, position, item)
      }
    }
  }

  fun onClickRecyclerListassortmentofcLinearArticle(
    view: View,
    position: Int,
    item: Listassortmentofc1RowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = ArticleDetailsActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
      1 ->  {
        val destIntent = ArticleDetailsActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }
  }

  companion object {
    const val TAG: String = "ARTICLE_FRAGMENT"

  }
}
