package com.shivangsapplication.app.modules.reviewproduct.`data`.model

import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ReviewProductModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtReviewCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_5_review2)

)
