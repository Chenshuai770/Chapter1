package net.println.kotlin.demo4

/**
 * Created by ChenShuai on 2018/7/22
 */
interface Driver {
    fun drive()
}

interface Writer {
    fun writer()
}

class Manager : Driver, Writer {
    override fun writer() {

    }

    override fun drive() {
    }

}

//todo 普通写法
class SeniorManager(val driver: Driver, val writer: Writer) : Driver, Writer { //todo 参数和属性的区别是方法体是否有val和var关键字

    override fun drive() {
    }

    override fun writer() {
    }
}

//todo 接口代理 代理给具体的类,充分说明能做什么,相当于放权给其他人去执行
class SeniorManagerBy(val driver: Driver, val writer: Writer) : Driver by driver, Writer by writer

class CarDriver : Driver {
    override fun drive() {
        println("开车呢")
    }
}

class PPTWriter : Writer {
    override fun writer() {
        println("做PPT呢")

    }
}

fun main(args: Array<String>) {
    val driver = CarDriver()
    val writer = PPTWriter()
    val seniorManagerBy = SeniorManagerBy(driver, writer)
    seniorManagerBy.drive()
    seniorManagerBy.writer()

}
