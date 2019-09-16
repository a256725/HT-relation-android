package com.yjy.community.api

import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *Created by weiweiyu
 * 575256725@qq.com
 *on 2019/7/5
 *
 * USDP HTDF 查询历史记录api
 */
interface CApi {
    @GET("/api/getRecord")
    fun getTx(@Query("address") address: String, @Query("height") height: String, @Query("type") type: String): Flowable<Any>


}
