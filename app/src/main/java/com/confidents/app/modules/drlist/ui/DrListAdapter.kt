package com.confidents.app.modules.drlist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.confidents.app.R
import com.confidents.app.databinding.RowDrListBinding
import com.confidents.app.modules.drlist.`data`.model.DrListRowModel
import kotlin.Int
import kotlin.collections.List

class DrListAdapter(
  var list: List<DrListRowModel>
) : RecyclerView.Adapter<DrListAdapter.RowDrListVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDrListVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_dr_list,parent,false)
    return RowDrListVH(view)
  }

  override fun onBindViewHolder(holder: RowDrListVH, position: Int) {
    val drListRowModel = DrListRowModel()
    // TODO uncomment following line after integration with data source
    // val drListRowModel = list[position]
    holder.binding.drListRowModel = drListRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DrListRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: DrListRowModel
    ) {
    }
  }

  inner class RowDrListVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDrListBinding = RowDrListBinding.bind(itemView)
    init {
      binding.linearDoctordetail.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DrListRowModel())
      }
    }
  }
}
