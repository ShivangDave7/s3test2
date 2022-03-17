package com.shivangsapplication.app.modules.choosecreditordebitcard.`data`.model

import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ChooseCreditOrDebitCardModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtChooseCard: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_choose_card)

)
