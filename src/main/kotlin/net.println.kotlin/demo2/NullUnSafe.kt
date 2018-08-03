package net.println.kotlin.demo2

/**
 * Created by ChenShuai on 2018/7/22
 */
fun getName(): String? {
    return null
}

fun main(args: Array<String>) {
    val name= getName() ?: null
    println(name?.length)

    val value:String?="HelloWorld"

    if (value is String){//todo 说明不为null类型则不需要使用强转
        println(value.length)
    }
    if (value!=null){
        println(value.length)//todo 本质和上面的if判断是一样的
    }

    println(value!!.length)// todo 显示说明改变量不会为null,否则报异常
}
