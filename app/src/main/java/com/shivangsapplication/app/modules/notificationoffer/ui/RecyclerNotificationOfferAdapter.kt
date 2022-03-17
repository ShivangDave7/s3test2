package com.shivangsapplication.app.modules.notificationoffer.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shivangsapplication.app.R
import com.shivangsapplication.app.databinding.RowNotificationOffer1Binding
import com.shivangsapplication.app.modules.notificationoffer.`data`.model.NotificationOffer1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerNotificationOfferAdapter(
  public var list: List<NotificationOffer1RowModel>
) : RecyclerView.Adapter<RecyclerNotificationOfferAdapter.RowNotificationOffer1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowNotificationOffer1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_notification_offer1,parent,false)
    return RowNotificationOffer1VH(view)
  }

  public override fun onBindViewHolder(holder: RowNotificationOffer1VH, position: Int): Unit {
    val notificationOffer1RowModel = NotificationOffer1RowModel()
    // TODO uncomment following line after integration with data source
    // val notificationOffer1RowModel = list[position]
    holder.binding.notificationOffer1RowModel = notificationOffer1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<NotificationOffer1RowModel>): Unit {
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
      item: NotificationOffer1RowModel
    ): Unit {
    }
  }

  public inner class RowNotificationOffer1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowNotificationOffer1Binding = RowNotificationOffer1Binding.bind(itemView)
  }
}
