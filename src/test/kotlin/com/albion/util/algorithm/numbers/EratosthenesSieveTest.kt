package com.albion.util.algorithm.numbers

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class EratosthenesSieveTest {

    @Test
    fun testBasic() {
        val n = 20
        val expected = intArrayOf(2, 3, 5, 7, 11, 13, 17, 19)
        val actual = EratosthenesSieve.sieveOfEratosthenes(n)
        assertArrayEquals(expected, actual)
    }
}