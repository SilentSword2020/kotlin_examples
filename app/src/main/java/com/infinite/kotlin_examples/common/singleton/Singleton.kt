package com.infinite.kotlin_examples.common.singleton

/**
 * 单例模式
 *
 * <a href="https://www.jianshu.com/p/5797b3d0ebd0"/>
 *
 */


/**
 * 有属性
 */
class SingletonDemo private constructor(val property: Int) {

    companion object {
        @Volatile
        private var instance: SingletonDemo? = null

        fun getInstance(property: Int) =
            instance ?: synchronized(this) {
                instance ?: SingletonDemo(property).also { instance = it }
            }
    }
}

/**
 * 没有属性
 */
class SingletonDemo2 private constructor() {
    companion object {
        val instance: SingletonDemo2 by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            SingletonDemo2()
        }
    }
}