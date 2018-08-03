package net.println.kotlin.demo3

/**
 * Created by ChenShuai on 2018/7/22
 */
val listFromLoop = listOf(1, "2", true, "高手")

fun main(args: Array<String>) {
    for ((index, value) in listFromLoop.withIndex()) {
        print("$index->$value\t")
    }
    //todo 相当于这样写
    for (indexedValue in listFromLoop.withIndex()){
        println("${indexedValue.index}->${indexedValue.value}")
    }
}