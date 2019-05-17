package com.albion.sorting

import java.util.*

class HeapSortV2(override var input: IntArray): BaseSort(input) {
    fun sort() {
        val queue = PriorityQueue<Int>(input.toMutableList())
        for (i in 0 until queue.size) {
            input[i] = queue.remove()
        }
    }
}