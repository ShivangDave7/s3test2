package com.shivangsapplication.app.modules.notification1.`data`.model

import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Notification1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtActivity: String? = MyApp.getInstance().resources.getString(R.string.lbl_activity)

)
