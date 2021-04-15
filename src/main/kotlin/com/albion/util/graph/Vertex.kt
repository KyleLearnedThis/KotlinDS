package com.albion.util.graph

data class Vertex(var id: String, var isVisited: Boolean = false, var cost: Int = Int.MAX_VALUE, var edges: MutableList<Edge> = mutableListOf())