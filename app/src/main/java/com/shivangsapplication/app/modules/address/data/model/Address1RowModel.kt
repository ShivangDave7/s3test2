package com.shivangsapplication.app.modules.address.`data`.model

import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Address1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPriscekila: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_priscekila)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddress: String? =
      MyApp.getInstance().resources.getString(R.string.msg_3711_spring_hil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMobileNo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_99_1234567890)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEdit: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDelete: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete)

)
