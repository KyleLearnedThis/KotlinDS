package com.albion.util.graph

import com.google.gson.Gson
import java.io.File

class Graph(inputName: String) {
    var map: MutableMap<String, Vertex> = mutableMapOf()
    init{
        openFile(inputName)
    }

    private fun openFile(file: String) {
        val base = File("./")
        val relativePath = "src/test/kotlin/com/albion/util/algorithm/resources/"
        val absoluteDirectoryPath = base.absolutePath + File.separator + relativePath
        val text = File(absoluteDirectoryPath, file).readText(Charsets.UTF_8)
        val gson = Gson()
        gson.fromJson(text, Vertices::class.java).vertices.forEach{
            val id = it.id
            map[id] = it
        }
    }
}