package com.shivangsapplication.app.modules.orderdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shivangsapplication.app.R
import com.shivangsapplication.app.databinding.RowOrderDetails1Binding
import com.shivangsapplication.app.modules.orderdetails.`data`.model.OrderDetails1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerOrderDetailsAdapter(
  public var list: List<OrderDetails1RowModel>
) : RecyclerView.Adapter<RecyclerOrderDetailsAdapter.RowOrderDetails1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOrderDetails1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_order_details1,parent,false)
    return RowOrderDetails1VH(view)
  }

  public override fun onBindViewHolder(holder: RowOrderDetails1VH, position: Int): Unit {
    val orderDetails1RowModel = OrderDetails1RowModel()
    // TODO uncomment following line after integration with data source
    // val orderDetails1RowModel = list[position]
    holder.binding.orderDetails1RowModel = orderDetails1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<OrderDetails1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: OrderDetails1RowModel
    ): Unit {
    }
  }

  public inner class RowOrderDetails1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowOrderDetails1Binding = RowOrderDetails1Binding.bind(itemView)
  }
}
