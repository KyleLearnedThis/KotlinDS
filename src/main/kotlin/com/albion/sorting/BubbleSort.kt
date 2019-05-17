package com.albion.sorting

class BubbleSort(override var input: IntArray) : BaseSort(input) {
    fun sort() {
        val len = input.size
        var i = 0
        var j: Int
        while (i < len) {
            j = 1
            while (j < len - i) {
                if (input[j - 1] > input[j]) {
                    swap(j, j-1)
                }
                j++
            }
            i++
        }
    }
}