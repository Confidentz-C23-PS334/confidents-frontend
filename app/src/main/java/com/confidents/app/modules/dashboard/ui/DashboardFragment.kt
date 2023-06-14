package com.confidents.app.modules.dashboard.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.confidents.app.R
import com.confidents.app.appcomponents.base.BaseFragment
import com.confidents.app.databinding.FragmentDashboardBinding
import com.confidents.app.modules.dashboard.`data`.model.DoctorRowModel
import com.confidents.app.modules.dashboard.`data`.model.ListassortmentofcRowModel
import com.confidents.app.modules.dashboard.`data`.viewmodel.DashboardVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DashboardFragment : BaseFragment<FragmentDashboardBinding>(R.layout.fragment_dashboard) {
  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val doctorAdapter = DoctorAdapter(viewModel.doctorList.value?:mutableListOf())
    binding.recyclerDoctor.adapter = doctorAdapter
    doctorAdapter.setOnItemClickListener(
    object : DoctorAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DoctorRowModel) {
        onClickRecyclerDoctor(view, position, item)
      }
    }
    )
    viewModel.doctorList.observe(requireActivity()) {
      doctorAdapter.updateData(it)
    }
    val listassortmentofcAdapter =
    ListassortmentofcAdapter(viewModel.listassortmentofcList.value?:mutableListOf())
    binding.recyclerListassortmentofc.adapter = listassortmentofcAdapter
    listassortmentofcAdapter.setOnItemClickListener(
    object : ListassortmentofcAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListassortmentofcRowModel) {
        onClickRecyclerListassortmentofc(view, position, item)
      }
    }
    )
    viewModel.listassortmentofcList.observe(requireActivity()) {
      listassortmentofcAdapter.updateData(it)
    }
    binding.dashboardVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerDoctor(
    view: View,
    position: Int,
    item: DoctorRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListassortmentofc(
    view: View,
    position: Int,
    item: ListassortmentofcRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_FRAGMENT"

  }
}
