package net.println.kotlin.demo5.closure

/**
 * Created by ChenShuai on 2018/8/3
 */
val string = "HelloWorld"

fun makeFun(): () -> Unit {
    var count = 0
    return fun() {
        println(++count)
    }
}

fun add(x: Int): (Int) -> Int {
    return fun(y: Int): Int {
        return x + y
    }
}

//todo 闭包写法 等同于前面的add方法
fun add1(x: Int) = fun(y: Int) = x + y

fun main(args: Array<String>) {

    var add5 = add(5)
    println(add5)
    println(add5(2))

}