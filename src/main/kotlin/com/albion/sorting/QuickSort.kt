package com.albion.sorting

class QuickSort(override var input: IntArray): BaseSort(input) {

    fun sort() {
        if (input.isEmpty()) {
            return
        }
        quicksort(0, input.size - 1)
    }

    private fun quicksort(low: Int, high: Int) {
        var i = low
        var j = high
        val pivotIndex = low + (high - low) / 2
        val pivotValue = input[pivotIndex]

        while (i <= j) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (input[i] < pivotValue) {
                i++
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (input[j] > pivotValue) {
                j--
            }
            if (i <= j) {
                swap(i, j)
                i++
                j--
            }
        }
        if (low < j) {
            quicksort(low, j)
        }
        if (i < high) {
            quicksort(i, high)
        }
    }
}