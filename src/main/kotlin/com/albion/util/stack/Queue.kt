package com.albion.util.stack

class Queue<T> {
    private var queue = ArrayList<T>()

    fun enqueue(n: T) {
        queue.add(n)
    }

    fun dequeue(): T {
        if(queue.isNotEmpty()) {
            val n = queue.first()
            queue.removeAt(0)
            return n
        } else {
            throw RuntimeException("Empty queue")
        }
    }

    fun size() = queue.size
}