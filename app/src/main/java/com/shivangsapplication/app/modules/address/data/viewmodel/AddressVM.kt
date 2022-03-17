package com.shivangsapplication.app.modules.address.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shivangsapplication.app.modules.address.`data`.model.Address1RowModel
import com.shivangsapplication.app.modules.address.`data`.model.AddressModel
import kotlin.collections.MutableList

public class AddressVM : ViewModel() {
  public val addressModel: MutableLiveData<AddressModel> = MutableLiveData(AddressModel())

  public var navArguments: Bundle? = null

  public val recyclerAddressList: MutableLiveData<MutableList<Address1RowModel>> =
      MutableLiveData(mutableListOf())
}
