package com.albion.util.algorithm

import com.albion.util.graph.Graph

class ShortestPath() {
    lateinit var graph: Graph

    fun openFile(name: String) {
        graph = Graph(name)
        graph.map.forEach{
            val key = it.key
            println("[id]: [$key]")
        }
    }
}