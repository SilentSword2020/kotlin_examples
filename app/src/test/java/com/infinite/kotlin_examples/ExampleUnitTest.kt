package com.infinite.kotlin_examples

import com.infinite.kotlin_examples.common.singleton.SingletonDemo
import com.infinite.kotlin_examples.common.singleton.SingletonDemo2
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun singleton_with_property() {
        System.out.println("test singleton_with_property()")
        val s1 = SingletonDemo.getInstance(2)
        val s2 = SingletonDemo.getInstance(3)
        assertEquals(s1, s2)
    }

    @Test
    fun singleton_no_property() {
        System.out.println("test singleton_no_property()")
        val s1 = SingletonDemo2.instance
        val s2 = SingletonDemo2.instance
        assertEquals(s1, s2)
    }
}
