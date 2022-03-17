package com.shivangsapplication.app.modules.search.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.base.BaseActivity
import com.shivangsapplication.app.databinding.ActivitySearchBinding
import com.shivangsapplication.app.modules.search.`data`.viewmodel.SearchVM
import com.shivangsapplication.app.modules.searchresult.ui.SearchResultActivity
import kotlin.String
import kotlin.Unit

public class SearchActivity : BaseActivity<ActivitySearchBinding>(R.layout.activity_search) {
  private val viewModel: SearchVM by viewModels<SearchVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.searchVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtLanguage.setOnClickListener {
      val destIntent = SearchResultActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "SEARCH_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
