package com.shivangsapplication.app.modules.account.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.base.BaseActivity
import com.shivangsapplication.app.databinding.ActivityAccountBinding
import com.shivangsapplication.app.modules.account.`data`.viewmodel.AccountVM
import com.shivangsapplication.app.modules.addpayment.ui.AddPaymentActivity
import com.shivangsapplication.app.modules.notification.ui.NotificationActivity
import com.shivangsapplication.app.modules.profile.ui.ProfileActivity
import kotlin.String
import kotlin.Unit

public class AccountActivity : BaseActivity<ActivityAccountBinding>(R.layout.activity_account) {
  private val viewModel: AccountVM by viewModels<AccountVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.accountVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageNotificationic.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearGroup378.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearGroup381.setOnClickListener {
      val destIntent = AddPaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "ACCOUNT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
