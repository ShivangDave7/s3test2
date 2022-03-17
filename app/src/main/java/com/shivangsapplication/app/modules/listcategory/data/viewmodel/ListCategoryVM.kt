package com.shivangsapplication.app.modules.listcategory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shivangsapplication.app.modules.listcategory.`data`.model.ListCategoryModel

public class ListCategoryVM : ViewModel() {
  public val listCategoryModel: MutableLiveData<ListCategoryModel> =
      MutableLiveData(ListCategoryModel())

  public var navArguments: Bundle? = null
}
