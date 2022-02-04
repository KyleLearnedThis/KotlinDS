package com.albion.util.graph

import com.google.gson.Gson
import java.io.File

class Graph(inputName: String) {
    var verticesMap: MutableMap<String, Vertex> = mutableMapOf()
    init{
        openFile(inputName)
    }

    private fun openFile(file: String) {
        val base = File("./")
        val relativePath = "src/test/kotlin/com/albion/util/algorithm/resources/"
        val absoluteDirectoryPath = base.absolutePath + File.separator + relativePath
        val text = File(absoluteDirectoryPath, file).readText(Charsets.UTF_8)
        val gson = Gson()
        gson.fromJson(text, Vertices::class.java)
                .vertices
                .forEach{
                    val id = it.id
                    verticesMap[id] = it
                }
    }

    fun bfs(source: String, target: String): Vertex? {
        val queue = mutableListOf<Vertex>()
        val root = verticesMap[source]!!
        queue.add(root)

        while(queue.isNotEmpty()) {
            val v = queue.removeAt(0)
            if(v.id == target) {
                v.isVisited = true
                return v
            }
            val edges = v.edges
            edges.forEach{
                val id = it.id
                val w = verticesMap[id]!!
                if(!w.isVisited) {
                    w.isVisited = true
                    queue.add(w)
                }
            }
        }

        return null
    }

    fun dfs(source: String, destination: String): Vertex? {
        val stack = mutableListOf<Vertex>()
        val v = verticesMap[source] ?: return null

        v.isVisited = true
        stack.add(0, v)

        while(stack.isNotEmpty()) {
            val edges = stack.removeAt(0).edges
            edges.forEach {
                val id = it.id
                val w = verticesMap[id]!!

                if(w.id == destination) {
                    return w
                }

                if(!w.isVisited) {
                    w.isVisited = true
                    stack.add(0, w)
                }
            }
        }
        return null
    }
}