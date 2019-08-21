package com.hzdy.kaixue2

/**
 * Created by Talon on 2019-08-21.
 * Desc:
 *
 */
class SingleInstance private constructor() {
    companion object {

        private val instance = SingleInstance()

        fun getInstance(): SingleInstance {
            return instance
        }
    }
}
