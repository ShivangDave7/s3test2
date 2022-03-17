package com.shivangsapplication.app.modules.notification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shivangsapplication.app.modules.notification.`data`.model.NotificationModel

public class NotificationVM : ViewModel() {
  public val notificationModel: MutableLiveData<NotificationModel> =
      MutableLiveData(NotificationModel())

  public var navArguments: Bundle? = null
}
