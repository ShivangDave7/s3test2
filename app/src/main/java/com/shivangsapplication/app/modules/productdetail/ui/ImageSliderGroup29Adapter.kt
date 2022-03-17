package com.shivangsapplication.app.modules.productdetail.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.shivangsapplication.app.databinding.SlideritemProductDetail1Binding
import com.shivangsapplication.app.modules.productdetail.`data`.model.ImageSliderGroup29Model
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public class ImageSliderGroup29Adapter(
  public val dataList: ArrayList<ImageSliderGroup29Model>,
  public val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderGroup29Model>(dataList, mIsInfinite) {
  public override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ): Unit {
    if (binding is SlideritemProductDetail1Binding) {
      binding.imageSliderGroup29Model = dataList[listPosition]
    }
  }

  public override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemProductDetail1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
