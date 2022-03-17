package com.shivangsapplication.app.modules.filter.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.base.BaseActivity
import com.shivangsapplication.app.databinding.ActivityFilterBinding
import com.shivangsapplication.app.modules.filter.`data`.viewmodel.FilterVM
import com.shivangsapplication.app.modules.searchresult.ui.SearchResultActivity
import kotlin.String
import kotlin.Unit

public class FilterActivity : BaseActivity<ActivityFilterBinding>(R.layout.activity_filter) {
  private val viewModel: FilterVM by viewModels<FilterVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.filterVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnApply.setOnClickListener {
      val destIntent = SearchResultActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "FILTER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FilterActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
