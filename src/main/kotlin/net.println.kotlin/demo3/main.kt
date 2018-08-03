@file:Suppress("ConvertLambdaToReference")

package net.println.kotlin.demo3

/**
 * Created by ChenShuai on 2018/7/22
 */

const val FINAL_HELLO_WORLD: String = "Hello world"
val helloWorld = FINAL_HELLO_WORLD
val list = listOf(1, 2, 'a', true)
val int2Float = fun(x: Int): Float { //todo 真正体现了函数式编程 这个函数是匿名函数
    return x.toFloat()
}

//()->unty
fun sumNormal(args1: Int, args2: Int) = args1 + args2 //todo 普通函数

val sumAnonymous = fun(args1: Int, args2: Int): Int { //todo 匿名函数 注意idea给自动提示了函数类型
    return args1 + args2
}
val sumLambda = { args1: Int, args2: Int ->
    println("$args1+$args2=${args1 + args2}")
    args1 + args2
} //todo lambda 表达式,参考匿名函数 返回函数体最后的结果

val printHello = {
    println("Hello")
}

fun main(args: Array<String>) {//(Array<String>)->Unit
    /* println(helloWorld)
     println(int2Float(3))
     println(sumLambda(1, 2))
     println(sumLambda.invoke(1, 2))//todo invoke 关键字是代表lambda的两个大括号
     list.forEach {
         print("$it\t") //todo 看源码 具体还原看下一行代码
     }
     list.forEach({ a: Any -> println(a) })
     list.forEach{ print(it)}
     list.forEach(::println) //todo 最简单的表达方式*/

    /*-----------------------------------------------------------------------*/

    /* list.forEach{ // todo  lambda 表达式并不是一个方法,而是一个var,所以这里return的是main方法
         if (it=='a')return
         print("$it\t")
     }

     println("程序停止,The End")*/
    /*-----------------------------------------------------------------------*/

    /*list.forEach Out@{
        // todo  lambda 表达式并不是一个方法,而是一个var,所以这里return是跳出lambda
        if (it == 'a') return@Out
        print("$it\t")
    }

    println("程序停止,The End")*/

    println(sumAnonymous)

}


