package net.println.kotlin.demo3

/**
 * Created by ChenShuai on 2018/7/22
 */

class X

class KotlinA {
    var a: Int =0
        get() {
            println("some one tries to get b.")
            return field
        }
        protected set(value) {
            println("some one tries to set b")
            field = value
        }
    var b = 2 //有初始化值
    lateinit var c: String //todo 延时初始化,不加会报错,简单理解成就是我到后面去赋值
    lateinit var d: X//todo 注意只有var能用lateinit val关键字只能用by进行委托
    val e: X by lazy {
        println("init X")
        X()
    }
}

fun main(args: Array<String>) {
    println("strat")
    val value=KotlinA()
    println("init a")
    println(value.b)
    println(value.e)

    value.c="so"
    println(value.c)
}