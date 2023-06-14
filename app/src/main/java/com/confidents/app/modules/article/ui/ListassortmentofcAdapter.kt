package com.confidents.app.modules.article.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.confidents.app.R
import com.confidents.app.databinding.RowListassortmentofc1Binding
import com.confidents.app.modules.article.`data`.model.Listassortmentofc1RowModel
import kotlin.Int
import kotlin.collections.List

class ListassortmentofcAdapter(
  var list: List<Listassortmentofc1RowModel>
) : RecyclerView.Adapter<ListassortmentofcAdapter.RowListassortmentofc1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListassortmentofc1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listassortmentofc1,parent,false)
    return RowListassortmentofc1VH(view)
  }

  override fun onBindViewHolder(holder: RowListassortmentofc1VH, position: Int) {
    val listassortmentofc1RowModel = Listassortmentofc1RowModel()
    // TODO uncomment following line after integration with data source
    // val listassortmentofc1RowModel = list[position]
    holder.binding.listassortmentofc1RowModel = listassortmentofc1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listassortmentofc1RowModel>) {
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
      item: Listassortmentofc1RowModel
    ) {
    }
  }

  inner class RowListassortmentofc1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListassortmentofc1Binding = RowListassortmentofc1Binding.bind(itemView)
    init {
      binding.linearArticle.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listassortmentofc1RowModel())
      }
    }
  }
}
