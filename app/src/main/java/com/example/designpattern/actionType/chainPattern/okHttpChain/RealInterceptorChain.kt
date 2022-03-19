package com.example.designpattern.actionType.chainPattern.okHttpChain

import android.util.Log
import java.util.*

//管理类
class RealInterceptorChain:InterceptorCallBack.Chain {

    private val mList: MutableList<InterceptorCallBack>? = ArrayList()
    private var index = 0
    private var lastResponse:String? = ""

    fun addLeaders(leader: InterceptorCallBack) {
        mList?.add(leader)
    }

    fun removeLeaders(leader: InterceptorCallBack) {
        mList?.remove(leader)
    }

    override fun proceed(request: String?): String? {
        lastResponse = request
        Log.d("__OKHttp-proceed-1","index的值：$index")
        if (mList == null ||mList.size == 0)  return lastResponse
        if (index >= mList.size) return lastResponse

        val nextIntIterator = mList[index]

        index ++
        Log.d("__OKHttp-proceed-2","lastResponse的值:$lastResponse")

        lastResponse = nextIntIterator.handle(this)
        return lastResponse
    }

    override fun getRequest(): String? {
        return lastResponse
    }
}