package com.albion.sorting

import org.junit.Test
import java.util.*

class SortingTest {

    @Test
    fun testInsertionSortBasic() {
        val input = intArrayOf(5,4,3,1,2,6,8,7,10,9)
        val sorter = InsertionSort(input)
        sorter.sort()
        println(Arrays.toString(input))
    }

    @Test
    fun testBubbleSortBasic() {
        val input = intArrayOf(5,4,3,1,2,6,8,7,10,9)
        val sorter = BubbleSort(input)
        sorter.sort()
        println(Arrays.toString(input))
    }

    @Test
    fun testHeapSortBasic() {
        val input = intArrayOf(5,4,3,1,2,6,8,7,10,9)
        val sorter = HeapSort(input)
        sorter.sort()
        println(Arrays.toString(input))
    }

    @Test
    fun testHeapSortV2Basic() {
        val input = intArrayOf(5,4,3,1,2,6,8,7,10,9)
        val sorter = HeapSortV2(input)
        sorter.sort()
        println(Arrays.toString(input))
    }

    @Test
    fun testQuickSortBasic() {
        val input = intArrayOf(5,4,3,1,2,6,8,7,10,9)
        val sorter = QuickSort(input)
        sorter.sort()
        println(Arrays.toString(input))
    }
}