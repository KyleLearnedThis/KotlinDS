package com.albion.sorting

import org.junit.Test
import java.util.*

class HeapSortTest {

    @Test
    fun testHeapSortBasic() {
        val input = intArrayOf(5,4,3,1,2,6,8,7,10,9)
        val sorter = HeapSort(input)
        sorter.sort()
        println(Arrays.toString(input))
    }
}