package net.println.kotlin.demo4.Extends

import java.lang.StringBuilder

/**
 * Created by ChenShuai on 2018/7/22
 */
fun main(args: Array<String>) {
    println("a" * (10))
    println("a" .a)
}


operator fun String.times(int: Int): String {  //运算符重载
    val stringBuilder = StringBuilder()
    for (i in 0 until int) {
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}


val String.a: String
    get() {
        return "abc"
    }