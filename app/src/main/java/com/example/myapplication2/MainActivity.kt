package com.example.myapplication2

import android.os.Bundle
import android.view.View
import com.chad.library.adapter.base.listener.OnItemClickListener
import androidx.appcompat.app.AppCompatActivity
import com.chad.library.adapter.base.BaseQuickAdapter
import com.example.myapplication2.adapter.HomeRvAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :AppCompatActivity(),OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadData()
        setAdapter()
    }

    private fun loadData() {
        setResources()
        mAdapter.setList(list)
    }
    var list = mutableListOf<MutableMap<Int, String>>()
    private fun setResources() {
        addItemResources(R.mipmap.main_record, getString(R.string.ic1))
        addItemResources(R.mipmap.main_record, getString(R.string.ic2))
        addItemResources(R.mipmap.main_record, getString(R.string.ic3))
        addItemResources(R.mipmap.main_record, getString(R.string.ic4))
        addItemResources(R.mipmap.main_record, getString(R.string.ic5))
        addItemResources(R.mipmap.main_record, getString(R.string.ic6))
        addItemResources(R.mipmap.main_record, getString(R.string.ic7))
        addItemResources(R.mipmap.main_record, getString(R.string.ic6))
        addItemResources(R.mipmap.main_record, getString(R.string.ic7))
    }

    private fun addItemResources(key: Int, value: String) {
        list.add(mutableMapOf<Int, String>(key to value))
    }
    private val mAdapter by lazy {
        HomeRvAdapter().apply {
            setOnItemClickListener(this@MainActivity)
        }
    }

    private fun setAdapter() {
        rv.adapter = mAdapter
    }
    override fun onItemClick(adapter: BaseQuickAdapter<*, *>, view: View, position: Int) {
    }
}