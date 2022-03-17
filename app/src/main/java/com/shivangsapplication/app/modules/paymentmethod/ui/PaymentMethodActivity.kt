package com.shivangsapplication.app.modules.paymentmethod.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.base.BaseActivity
import com.shivangsapplication.app.databinding.ActivityPaymentMethodBinding
import com.shivangsapplication.app.modules.choosecreditordebitcard.ui.ChooseCreditOrDebitCardActivity
import com.shivangsapplication.app.modules.paymentmethod.`data`.viewmodel.PaymentMethodVM
import kotlin.String
import kotlin.Unit

public class PaymentMethodActivity :
    BaseActivity<ActivityPaymentMethodBinding>(R.layout.activity_payment_method) {
  private val viewModel: PaymentMethodVM by viewModels<PaymentMethodVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.paymentMethodVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearGroup354.setOnClickListener {
      val destIntent = ChooseCreditOrDebitCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "PAYMENT_METHOD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PaymentMethodActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
