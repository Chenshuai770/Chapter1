package net.println.kotlin.demo4.overload

/**
 * Created by ChenShuai on 2018/7/22
 * 方法重载
 */

class Overloads{
    /*fun a():Int{
        return 0
    }*/
    @JvmOverloads //todo java调用可以实现默认参数,java没有默认参数这么一说,而且重写也会遇到问题
    fun a(int:Int=0):Int{
        return int
    }
}

val listofOverloads= mutableListOf(1,2,35,55)
fun main(args: Array<String>) {
    val overloads=Overloads()
    println(overloads.a())
    listofOverloads.removeAt(2)
    listofOverloads.remove(2)
    println(listofOverloads)
}