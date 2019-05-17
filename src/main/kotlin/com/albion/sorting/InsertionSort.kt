package com.albion.sorting

class InsertionSort(override var input: IntArray): BaseSort(input) {
    fun sort() {
        if (input.isEmpty()) {
            return
        } else {
            for(count in 1 until input.count()){
                val item = input[count]
                var i = count
                while (i>0 && item < input[i - 1]) {
                    input[i] = input[i - 1]
                    i -= 1
                }
                input[i] = item
            }
        }
    }
}