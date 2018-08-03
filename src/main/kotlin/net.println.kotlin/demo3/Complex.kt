package net.println.kotlin.demo3

/**
 * Created by ChenShuai on 2018/7/22
 * 复数的使用
 */
data class Complex(var real:Double,var imaginary:Double){
    operator fun plus(other:Complex):Complex{//todo oprator重载运算符
        return Complex(real+other.real,imaginary+other.imaginary)
    }
}

fun main(args: Array<String>) {
    val c1=Complex(3.0,4.0)
    val c2=Complex(2.0,7.5)
    println(c1+c2)
}