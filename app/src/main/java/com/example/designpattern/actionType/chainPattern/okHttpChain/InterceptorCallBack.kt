package com.example.designpattern.actionType.chainPattern.okHttpChain

interface  InterceptorCallBack {

    fun handle(chain: Chain):String? //类似于intercept方法

    interface Chain {
        fun proceed(requestStr: String?): String?
        fun getRequest():String?
    }
}