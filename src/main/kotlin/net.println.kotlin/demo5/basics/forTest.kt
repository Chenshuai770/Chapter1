package net.println.kotlin.demo5.basics

/**
 * Created by ChenShuai on 2018/8/3
 */
class Hello{
    fun world(): Unit {
        println("Hello World")
    }
}

fun main(args: Array<String>) {
    val hello= Hello()
    val helloWorld=hello::world
    println(helloWorld)
}