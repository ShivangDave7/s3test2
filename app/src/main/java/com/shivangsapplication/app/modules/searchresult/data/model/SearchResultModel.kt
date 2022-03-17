package com.shivangsapplication.app.modules.searchresult.`data`.model

import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class SearchResultModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtResultCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_145_result)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtManShoes: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shoes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup46Value: String? = null
)
