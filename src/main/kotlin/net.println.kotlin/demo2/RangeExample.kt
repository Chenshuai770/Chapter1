package net.println.kotlin.demo2

/**
 * Created by ChenShuai on 2018/7/22
 */
val range:IntRange=0..1024//todo 闭区间 [0,1023]
val range_exclusive:IntRange=0 until 1024 //todo 开区间 [0,1024) =[0,1023]
val emptyRange:IntRange=0..-1
fun main(args: Array<String>) {
    println(emptyRange.isEmpty())
    println(range.contains(-1))//todo A写法
    println(-1 in range)//todo B写法 完全等加,方法修饰符 operator
}