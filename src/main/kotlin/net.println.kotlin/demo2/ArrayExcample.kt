package net.println.kotlin.demo2

/**
 * Created by ChenShuai on 2018/7/22
 */

val arrayofChar:CharArray= charArrayOf('H','e','l','l','o')

fun main(args: Array<String>) {
    println(arrayofChar)
    println(arrayofChar.joinToString("!"))
    println(arrayofChar.slice(1..4))
}