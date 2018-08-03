package net.println.kotlin.demo5.builtins

import net.println.kotlin.demo3.hello
import java.io.BufferedReader
import java.io.FileReader

/**
 * Created by ChenShuai on 2018/8/3
 */
fun main(args: Array<String>) {
//  val br = BufferedReader(FileReader("hello.txt"))
//  withReadline(br)
//    readText()
    //todo 使用use可以去掉close
    BufferedReader(FileReader("hello.txt")).use {
        var line:String?
        while (true){
            line=it.readLine()?:break
            println(line)
        }
    }
}

private fun readText() {
    val br = BufferedReader(FileReader("hello.txt")).readText()
    println(br)
}


private fun withReadline(br: BufferedReader) {
    with(br) {
        var line: String?
        while (true) {
            line = readLine() ?: break
            println(line)
        }
        close()
    }
}