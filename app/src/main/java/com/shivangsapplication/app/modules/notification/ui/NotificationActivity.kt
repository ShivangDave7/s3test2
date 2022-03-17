package com.shivangsapplication.app.modules.notification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.base.BaseActivity
import com.shivangsapplication.app.databinding.ActivityNotificationBinding
import com.shivangsapplication.app.modules.notification.`data`.viewmodel.NotificationVM
import com.shivangsapplication.app.modules.notification1.ui.Notification1Activity
import com.shivangsapplication.app.modules.notificationfeed.ui.NotificationFeedActivity
import com.shivangsapplication.app.modules.notificationoffer.ui.NotificationOfferActivity
import kotlin.String
import kotlin.Unit

public class NotificationActivity :
    BaseActivity<ActivityNotificationBinding>(R.layout.activity_notification) {
  private val viewModel: NotificationVM by viewModels<NotificationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.notificationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearGroup223.setOnClickListener {
      val destIntent = NotificationOfferActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearGroup224.setOnClickListener {
      val destIntent = NotificationFeedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearGroup225.setOnClickListener {
      val destIntent = Notification1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "NOTIFICATION_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
