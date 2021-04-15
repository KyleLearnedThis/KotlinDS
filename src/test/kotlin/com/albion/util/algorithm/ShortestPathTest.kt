package com.albion.util.algorithm

import org.junit.Before
import org.junit.Test


internal class ShortestPathTest {

    lateinit var shortestPath: ShortestPath

    @Before
    fun init() {
        shortestPath = ShortestPath()
    }

    @Test
    fun testBasic() {
        shortestPath.openFile("path02.json")
    }
}