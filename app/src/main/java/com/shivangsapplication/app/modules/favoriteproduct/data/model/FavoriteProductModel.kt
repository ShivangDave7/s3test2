package com.shivangsapplication.app.modules.favoriteproduct.`data`.model

import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class FavoriteProductModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFavoriteProduc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_favorite_produc)

)
