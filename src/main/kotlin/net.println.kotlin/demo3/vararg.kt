package net.println.kotlin.demo3

/**
 * Created by ChenShuai on 2018/7/22
 */
//todo vararg是变长参数
fun main(vararg args: String) {

    hello( 2.3,1,2,3,4,5,string = "Hello")
}

fun hello(double: Double,vararg ints:Int,string: String){
    ints.forEach (::println)
    println(string)
}