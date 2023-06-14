package com.confidents.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.confidents.app.R
import com.confidents.app.databinding.RowListassortmentofcBinding
import com.confidents.app.modules.dashboard.`data`.model.ListassortmentofcRowModel
import kotlin.Int
import kotlin.collections.List

class ListassortmentofcAdapter(
  var list: List<ListassortmentofcRowModel>
) : RecyclerView.Adapter<ListassortmentofcAdapter.RowListassortmentofcVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListassortmentofcVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listassortmentofc,parent,false)
    return RowListassortmentofcVH(view)
  }

  override fun onBindViewHolder(holder: RowListassortmentofcVH, position: Int) {
    val listassortmentofcRowModel = ListassortmentofcRowModel()
    // TODO uncomment following line after integration with data source
    // val listassortmentofcRowModel = list[position]
    holder.binding.listassortmentofcRowModel = listassortmentofcRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListassortmentofcRowModel>) {
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
      item: ListassortmentofcRowModel
    ) {
    }
  }

  inner class RowListassortmentofcVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListassortmentofcBinding = RowListassortmentofcBinding.bind(itemView)
  }
}
