package com.shivangsapplication.app.modules.notification.`data`.model

import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNotification: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.lbl_offer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeed: String? = MyApp.getInstance().resources.getString(R.string.lbl_feed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAcivity: String? = MyApp.getInstance().resources.getString(R.string.lbl_acivity)

)
