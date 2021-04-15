package com.albion.util.algorithm

import org.junit.Assert
import org.junit.Before
import org.junit.Test


internal class ShortestPathTest {

    private lateinit var shortestPath: ShortestPath

    @Before
    fun init() {
        shortestPath = ShortestPath()
    }

    @Test
    fun testBasic() {
        shortestPath.openFile("path02.json")
        val result = shortestPath.findShortestPath("San Francisco", "London")
        val expectedCost = 6537
        val actualCost = result.last()?.cost
        Assert.assertEquals(expectedCost, actualCost)
    }
}