package com.albion.util.algorithm.graphs

import com.albion.util.graph.Graph
import com.albion.util.graph.Vertex
import java.util.PriorityQueue

class ShortestPath {
    private lateinit var graph: Graph

    fun openFile(name: String) {
        graph = Graph(name)
    }

    private fun initializeGraph(source: String) {
        graph.verticesMap.forEach{
            val id = it.key
            val vertex = it.value
            vertex.cost = if(id == source) {
                 0
            } else {
                Int.MAX_VALUE
            }
        }
    }

    fun findShortestPath(source: String, destination: String): MutableList<Vertex> {
        initializeGraph(source)
        val queue: PriorityQueue<Vertex> = PriorityQueue { o1: Vertex, o2: Vertex -> o1.cost - o2.cost }
        graph.verticesMap.forEach{
            val vertex = it.value
            queue.add(vertex)
        }

        while(queue.isNotEmpty()) {
            val u = queue.poll()
            val cost = u.cost
            val edges = u.edges

            for(edge in edges) {
                val edgeId = edge.id
                val weight = edge.weight
                val alt = cost + weight
                val v = graph.verticesMap[edgeId]!!

                val neighborWeight = v.cost
                if(alt < neighborWeight) {
                    v.cost = alt
                    v.previous = u
                    refreshQueue(queue, v)
                }
            }
        }

        return generatePath(destination)
    }

    private fun refreshQueue(queue: PriorityQueue<Vertex>, vertex: Vertex) {
        queue.remove(vertex)
        queue.add(vertex)
    }

    private fun generatePath(destination: String): MutableList<Vertex> {
        val result= mutableListOf<Vertex>()
        var v: Vertex? = graph.verticesMap[destination]
        do {
            result.add(0, v!!)
            v = v.previous
        } while(v != null)

        result.forEach {
            println("===== [id]: [${it.id}] [cost]: [${it.cost}] =====")
        }
        return  result
    }
}