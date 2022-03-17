package com.shivangsapplication.app.modules.search.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shivangsapplication.app.modules.search.`data`.model.SearchModel

public class SearchVM : ViewModel() {
  public val searchModel: MutableLiveData<SearchModel> = MutableLiveData(SearchModel())

  public var navArguments: Bundle? = null
}
