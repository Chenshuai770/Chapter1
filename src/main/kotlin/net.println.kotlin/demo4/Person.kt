package net.println.kotlin.demo4

/**
 * Created by ChenShuai on 2018/7/22
 */
abstract class Person(open val age: Int) {
    open fun work(): Unit {

    }
}

class MaNong(age: Int) : Person(age) {
    override val age: Int
        get() = 0

    override fun work() {
        println("我是码农")
    }
}

class Doctod(age: Int) : Person(age) {
    override fun work() {
        println("我是医生")
    }
}

fun main(args: Array<String>) {
    val person = MaNong(22)
    person.work()
    println(person.age)

    val person2 = Doctod(26)
    person2.work()
    println(person2.age)
}