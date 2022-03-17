package com.shivangsapplication.app.modules.successscreen.`data`.model

import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class SuccessScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtThankyoufors: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_s)

)
