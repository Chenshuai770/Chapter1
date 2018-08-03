package net.println.kotlin.demo5.tailrecursive

/**
 * Created by ChenShuai on 2018/8/3
 */
data class ListNode(val value: Int, var next: ListNode?)

//todo 尾递归 tailrec 关键字,必须是尾递归
tailrec fun findListNode(head: ListNode?, value: Int): ListNode? {
    head ?: return null
    if (head.value == value) return head
    return findListNode(head.next, value)

}

//阶乘
fun factorial(n:Long):Long{
    return n* factorial(n-1)
}


fun main(args: Array<String>) {

}