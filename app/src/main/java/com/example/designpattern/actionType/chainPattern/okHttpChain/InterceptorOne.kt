package com.example.designpattern.actionType.chainPattern.okHttpChain

import android.util.Log

class InterceptorOne : InterceptorCallBack {

    override fun handle(chain: InterceptorCallBack.Chain): String? {
        Log.d("__OKHttp-InterceptorOne","我Leader1处理过了，传给下一个拦截器")
        val request = chain.getRequest()
        val result = request + "我Leader1处理过了，传给下一个拦截器"
        val response = chain.proceed(result)
        return response
    }
}