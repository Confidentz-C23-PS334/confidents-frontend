package com.confidents.app.modules.drlist.ui

import android.view.View
import androidx.activity.viewModels
import com.confidents.app.R
import com.confidents.app.appcomponents.base.BaseActivity
import com.confidents.app.databinding.ActivityDrListBinding
import com.confidents.app.modules.drdetails.ui.DrDetailsActivity
import com.confidents.app.modules.drlist.`data`.model.DrListRowModel
import com.confidents.app.modules.drlist.`data`.viewmodel.DrListVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DrListActivity : BaseActivity<ActivityDrListBinding>(R.layout.activity_dr_list) {
  private val viewModel: DrListVM by viewModels<DrListVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val drListAdapter = DrListAdapter(viewModel.drListList.value?:mutableListOf())
    binding.recyclerDrList.adapter = drListAdapter
    drListAdapter.setOnItemClickListener(
    object : DrListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DrListRowModel) {
        onClickRecyclerDrList(view, position, item)
      }
    }
    )
    viewModel.drListList.observe(this) {
      drListAdapter.updateData(it)
    }
    binding.drListVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerDrList(
    view: View,
    position: Int,
    item: DrListRowModel
  ): Unit {
    when(view.id) {
      R.id.linearDoctordetail ->  {
        onClickRecyclerDrListLinearDoctordetail(view, position, item)
      }
    }
  }

  fun onClickRecyclerDrListLinearDoctordetail(
    view: View,
    position: Int,
    item: DrListRowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = DrDetailsActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 ->  {
        val destIntent = DrDetailsActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 ->  {
        val destIntent = DrDetailsActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      3 ->  {
        val destIntent = DrDetailsActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "DR_LIST_ACTIVITY"

  }
}
