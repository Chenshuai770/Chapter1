package net.println.kotlin.demo3

/**
 * Created by ChenShuai on 2018/7/22
 */
private const val USERNAME="kotlin"
private const val PASSWORD="jetbrains"

private const val ADMIN_USER="admin"
private const val ADMIN_PASSWORD="admin"

private const val DEBUG=1
private const val USER=1

fun main(args: Array<String>) {


    println("请输入用户名:")
    val userName= readLine()
    println("请输入密码:")
    val paaword= readLine()

    if (userName== USERNAME &&paaword== PASSWORD){
        println("登录成功")
    }else{
        println("登录失败")
    }
}