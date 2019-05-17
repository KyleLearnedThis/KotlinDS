package com.albion.sorting


class HeapSort(override var input: IntArray) : BaseSort(input) {
    fun sort() {
        val n = input.size
        // Build heap (rearrange array)
        for (i in n / 2 - 1 downTo 0){
            heapify(input, n, i)
        }

        // One by one extract an element from heap
        for (i in n - 1 downTo 0) {
            swap(i, 0)
            heapify(input, i, 0)
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    private fun heapify(arr: IntArray, n: Int, i: Int) {
        var largest = i  // Initialize largest as root
        val l = 2 * i + 1  // left = 2*i + 1
        val r = 2 * i + 2  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest]) {
            largest = l
        }

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest]) {
            largest = r
        }
        // If largest is not root
        if (largest != i) {
            swap(i, largest)
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest)
        }
    }
}