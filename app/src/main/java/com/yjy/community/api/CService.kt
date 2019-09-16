package com.yjy.community.api

import com.weiyu.baselib.net.ApiManager
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

//节点切换不能用单例
class CService() {
    val base=""
    fun cApi(): CApi {
        return ApiManager.instance.getService(base, CApi::class.java)
    }

    fun getTx(address: String, height: String): Flowable<Any> = cApi().getTx(address, height, "yes").subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())

}