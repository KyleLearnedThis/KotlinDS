package com.albion.util.algorithm.numbers

// https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
class EratosthenesSieve {
    companion object {
        fun sieveOfEratosthenes(n: Int): IntArray {
            // This basic solution is not optimal for large number due to its memory usage so limited to 1K.
            if(n >= 1024){
                return intArrayOf()
            }
            val prime = BooleanArray(n + 1) { true }
            var p = 2
            while (p * p <= n) {
                if (prime[p]) {
                    // Update all multiples of p
                    var i = p * p
                    while (i <= n) {
                        prime[i] = false
                        i += p
                    }
                }
                p++
            }
            val list = mutableListOf<Int>()
            for (i in 2..n) {
                if (prime[i]) {
                    list.add(i)
                }
            }
            return list.toIntArray()
        }
    }
}