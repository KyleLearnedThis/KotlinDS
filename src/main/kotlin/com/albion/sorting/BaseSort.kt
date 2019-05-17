package com.albion.sorting

open class BaseSort(open var input: IntArray) {
    fun swap(i: Int, j: Int) {
        input[i] = input[j].also { input[j] = input[i] }
    }
}