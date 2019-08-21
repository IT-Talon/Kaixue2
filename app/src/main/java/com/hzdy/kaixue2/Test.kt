package com.hzdy.kaixue2

import java.util.*

/**
 * Created by Talon on 2019-08-21.
 * Desc:
 */
object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        val num = 1..100000
        val arr = arrayOfNulls<Int>(100000)
        var sum = 0
        for (i in num) {
            arr[i - 1] = i
        }
//        val intarr = intArrayOf()
        val startTime = Date().time
        println(startTime)
        for (j in arr) {
            sum += j!!
        }
        val avg = sum / 100000
        val time = Date().time
        println("sum= $sum avg= $avg time=$time")
    }
}
