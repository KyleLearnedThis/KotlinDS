package com.albion.util.graph


import org.junit.Assert
import org.junit.Test


internal class GraphTest {

    @Test
    fun testBasicBFS() {
        val graph = Graph("path02.json")
        val source = "San Francisco"
        val destination = "London"
        val v = graph.bfs(source, destination)
        Assert.assertEquals(destination, v?.id)
    }

    @Test
    fun testBasicDFS() {
        val graph = Graph("path02.json")
        val source = "San Francisco"
        val destination = "London"
        val v = graph.dfs(source, destination)
        Assert.assertEquals(destination, v?.id)
    }
}