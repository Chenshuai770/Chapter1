package net.println.kotlin.demo5.builtins

import kotlin.concurrent.fixedRateTimer

/**
 * Created by ChenShuai on 2018/8/3
 */

fun main(args: Array<String>) {
    val list = listOf(1, 3, 4, 5, 10, 3, 2)
    val list2 = listOf(1..2, 1..3, 100..333)
    // addNewList(list)
    //map(list)
    //faltmap(list2)
    val flatMap = list2.flatMap { it }
    flatMap.reduce { acc, intRange -> acc + intRange }
    //  println(flatMap.reduce { a, i -> a+i })

    println((0..6).map(::factorial).fold(5) { acc, i ->
        acc + i
    })

    println((0..6).joinToString (","))


}

fun factorial(n: Int): Int {
    if (n == 0) return 1
    return (1..n).reduce { acc, i -> acc * i }

}

private fun faltmap(list2: List<IntRange>) {
    val flatlsit = list2.flatMap { intRange ->
        intRange.map { intElement ->
            "No.$intElement"
        }
    }
    flatlsit.forEach(::println)
}

private fun map(list: List<Int>) {
    val newlist1 = list.map(Int::toDouble)

    newlist1.forEach(::println)
}

private fun addNewList(list: List<Int>) {
    val newList = ArrayList<Int>()
    list.forEach {
        val newElement = it * 2
        newList.add(newElement)
    }
    newList.forEach(::println)
}