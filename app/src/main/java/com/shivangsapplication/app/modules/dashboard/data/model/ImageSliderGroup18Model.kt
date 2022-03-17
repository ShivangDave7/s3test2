package com.shivangsapplication.app.modules.dashboard.`data`.model

import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ImageSliderGroup18Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtOffer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_super_flash_sal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var imagePromotionImage: String? = ""

)
