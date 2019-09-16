package com.yjy.community.ui.activity

import android.support.v4.app.Fragment
import android.view.View
import android.widget.TextView
import com.weiyu.baselib.base.BaseActivity
import com.yjy.community.R
import com.yjy.community.ui.fragment.ActiveFragment
import com.yjy.community.ui.fragment.CommunityFragment
import com.yjy.community.ui.fragment.IndexFragment
import com.yjy.community.ui.fragment.MyFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    var fragments = arrayOf<Fragment>()
    var textviews = arrayOf<TextView>()
    override fun getContentLayoutResId(): Int = R.layout.activity_main

    override fun initializeContentViews() {
        fragments = arrayOf(IndexFragment(), ActiveFragment(), CommunityFragment(), MyFragment())
        textviews = arrayOf(tv_menu0_icon, tv_menu1_icon, tv_menu2_icon, tv_menu3_icon)
        textviews[0].isSelected = true
        supportFragmentManager.beginTransaction()
            .add(R.id.fl_content, fragments[0])
            .show(fragments[0]).commit()
    }
    var index = 0
    var currentTabIndex = 0
    fun onclick(v: View) {
        when (v.id) {
            R.id.rl_menu0 -> {
                index = 0
            }
            R.id.rl_menu1 -> {
                index = 1
            }
            R.id.rl_menu2 -> {
                index = 2
            }
            R.id.rl_menu3 -> {
                index = 3
            }
        }
        if (currentTabIndex != index) {
            val trx = supportFragmentManager.beginTransaction()
            trx.hide(fragments[currentTabIndex])
            textviews[currentTabIndex].isSelected = false
            if (!fragments[index].isAdded) {
                trx.add(R.id.fl_content, fragments[index])
            }
            trx.show(fragments[index]).commit()
            textviews[index].isSelected = true
        } else {
//            fragments[index].backTop()
        }
        currentTabIndex = index
    }
}
