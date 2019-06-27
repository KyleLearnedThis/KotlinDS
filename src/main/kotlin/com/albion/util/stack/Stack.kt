package com.albion.util.stack

class Stack<T>{
    private var stack = ArrayList<T>()

    fun push(n: T) {
        stack.add(n)
    }

    fun pop(): T {
        if(stack.isNotEmpty()){
            val last = stack.last()
            stack.removeAt(stack.size - 1)
            return last
        } else {
            throw RuntimeException("Empty stack")
        }
    }

    fun size() = stack.size
}