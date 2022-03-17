package com.shivangsapplication.app.modules.creditcardanddebit.`data`.model

import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class CreditCardAndDebitModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreditCardAnd: String? =
      MyApp.getInstance().resources.getString(R.string.msg_credit_card_and)

)
