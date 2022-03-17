package com.shivangsapplication.app.modules.addaddress.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.base.BaseActivity
import com.shivangsapplication.app.databinding.ActivityAddAddressBinding
import com.shivangsapplication.app.modules.addaddress.`data`.viewmodel.AddAddressVM
import kotlin.String
import kotlin.Unit

public class AddAddressActivity :
    BaseActivity<ActivityAddAddressBinding>(R.layout.activity_add_address) {
  private val viewModel: AddAddressVM by viewModels<AddAddressVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.addAddressVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "ADD_ADDRESS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddAddressActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
