package com.shivangsapplication.app.modules.dashboard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.base.BaseActivity
import com.shivangsapplication.app.databinding.ActivityDashboardBinding
import com.shivangsapplication.app.modules.dashboard.`data`.model.Dashboard2RowModel
import com.shivangsapplication.app.modules.dashboard.`data`.model.Dashboard3RowModel
import com.shivangsapplication.app.modules.dashboard.`data`.model.Dashboard4RowModel
import com.shivangsapplication.app.modules.dashboard.`data`.model.ImageSliderGroup18Model
import com.shivangsapplication.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.shivangsapplication.app.modules.favoriteproduct.ui.FavoriteProductActivity
import com.shivangsapplication.app.modules.listcategory.ui.ListCategoryActivity
import com.shivangsapplication.app.modules.notification.ui.NotificationActivity
import com.shivangsapplication.app.modules.offerscreen.ui.OfferScreenActivity
import com.shivangsapplication.app.modules.productdetail.ui.ProductDetailActivity
import com.shivangsapplication.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

public class DashboardActivity : BaseActivity<ActivityDashboardBinding>(R.layout.activity_dashboard)
    {
  private val imageSliderGroup18Items: ArrayList<ImageSliderGroup18Model> = arrayListOf()

  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val imageSliderGroup18Adapter = ImageSliderGroup18Adapter(imageSliderGroup18Items,true)
    binding.imageSliderGroup18.adapter = imageSliderGroup18Adapter
    binding.imageSliderGroup18.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroup16.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup16.updateIndicatorCounts(binding.imageSliderGroup18.indicatorCount)
    val recyclerFlashSaleAdapter =
    RecyclerFlashSaleAdapter(viewModel.recyclerFlashSaleList.value?:mutableListOf())
    binding.recyclerFlashSale.adapter = recyclerFlashSaleAdapter
    recyclerFlashSaleAdapter.setOnItemClickListener(
    object : RecyclerFlashSaleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Dashboard2RowModel) {
        onClickRecyclerFlashSale(view, position, item)
      }
    }
    )
    viewModel.recyclerFlashSaleList.observe(this) {
      recyclerFlashSaleAdapter.updateData(it)
    }
    val recyclerMegaSaleAdapter =
    RecyclerMegaSaleAdapter(viewModel.recyclerMegaSaleList.value?:mutableListOf())
    binding.recyclerMegaSale.adapter = recyclerMegaSaleAdapter
    recyclerMegaSaleAdapter.setOnItemClickListener(
    object : RecyclerMegaSaleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Dashboard3RowModel) {
        onClickRecyclerMegaSale(view, position, item)
      }
    }
    )
    viewModel.recyclerMegaSaleList.observe(this) {
      recyclerMegaSaleAdapter.updateData(it)
    }
    val recyclerDashboardAdapter =
    RecyclerDashboardAdapter(viewModel.recyclerDashboardList.value?:mutableListOf())
    binding.recyclerDashboard.adapter = recyclerDashboardAdapter
    recyclerDashboardAdapter.setOnItemClickListener(
    object : RecyclerDashboardAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Dashboard4RowModel) {
        onClickRecyclerDashboard(view, position, item)
      }
    }
    )
    viewModel.recyclerDashboardList.observe(this) {
      recyclerDashboardAdapter.updateData(it)
    }
    binding.dashboardVM = viewModel
  }

  public override fun onPause(): Unit {
    binding.imageSliderGroup18.pauseAutoScroll()
    super.onPause()
  }

  public override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderGroup18.resumeAutoScroll()
  }

  public override fun setUpClicks(): Unit {
    binding.imageNotificationic.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSearchProduct.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSearchProduct.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageLoveicon.setOnClickListener {
      val destIntent = FavoriteProductActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtMoreCategoryL.setOnClickListener {
      val destIntent = ListCategoryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFlashsalehead.setOnClickListener {
      val destIntent = OfferScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerFlashSale(
    view: View,
    position: Int,
    item: Dashboard2RowModel
  ): Unit {
    when(view.id) {
      R.id.linearProduct ->  {
        val destIntent = ProductDetailActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  public fun onClickRecyclerMegaSale(
    view: View,
    position: Int,
    item: Dashboard3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerDashboard(
    view: View,
    position: Int,
    item: Dashboard4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "DASHBOARD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
