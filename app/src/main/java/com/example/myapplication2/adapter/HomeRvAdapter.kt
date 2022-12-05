package com.example.myapplication2.adapter

import coil.load
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.myapplication2.R
import kotlinx.android.synthetic.main.item_home.view.*

/**
 * Created by WLM on 2021/8/7
 * Desc:
 */
class HomeRvAdapter(layoutResId: Int = R.layout.item_home) :
    BaseQuickAdapter<MutableMap<Int, String>, BaseViewHolder>(layoutResId) {
    override fun convert(helper: BaseViewHolder, item: MutableMap<Int, String>) {
        helper.itemView.run {
            item.entries.forEach {
                iv_item.load(it.key)
                tv_item.text = it.value
            }
        }
    }
}