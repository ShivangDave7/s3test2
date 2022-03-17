package com.shivangsapplication.app.modules.changepassword.`data`.model

import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ChangePasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtChangePassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOldPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_old_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNewPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_new_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNewPasswordAg: String? =
      MyApp.getInstance().resources.getString(R.string.msg_new_password_ag)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup90Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup91Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup92Value: String? = null
)
