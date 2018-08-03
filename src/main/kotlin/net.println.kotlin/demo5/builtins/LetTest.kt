package net.println.kotlin.demo5.builtins

/**
 * Created by ChenShuai on 2018/8/3
 */

data class Person(val name: String, val age: Int){
    fun work(): Unit {
        println("$name is working")
    }
}

fun main(args: Array<String>) {

    val person=Person("cs",23)
    findPerson(person)?.let {
        it.work()
    }
}

fun findPerson(person:Person): Person? {
    return person
}
