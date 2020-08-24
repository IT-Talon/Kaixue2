package com.hzdy.kaixue2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SingleInstance.getInstance()
    }

    fun main(args: Array<String>) {
        // another
        funArgs(1, 10f)
    }

    fun funArgs(a: Int, b: Float) {
        print(a + b)

    }

    fun test(){
        print("newBr test!!")
    }
}

