package com.albion.list

class List<T> {
    var head: ListNode<T>? = null
    var tail: ListNode<T>? = null

    constructor(input: Array<T>) {
        for(i in input){
            append(i)
        }
    }

    fun append(n: T) {
        if (head == null) {
            head = ListNode(n)
            tail = head
        } else {
            val cur = ListNode(n)
            tail?.next = cur
            cur.prev = tail
            tail = cur
        }
    }

    fun printList() {
        var cur = head
        while (cur != null) {
            val data = cur.data
            print("[$data] ")
            cur = cur.next
        }
        println("")
    }

    fun printListReverse() {
        var cur = tail
        while (cur != null) {
            val data = cur.data
            print("[$data] ")
            cur = cur.prev
        }
        println("")
    }

    fun size(): Int {
        var size = 0
        var cur = head
        while(cur != null) {
            size++
            cur = cur?.next
        }
        return size
    }
}