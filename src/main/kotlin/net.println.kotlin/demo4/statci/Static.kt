package net.println.kotlin.demo4.statci

/**
 * Created by ChenShuai on 2018/7/22
 */
val listStatic = listOf(22, 2)

fun main(args: Array<String>) {
    val minValue = minOf(listStatic[0], listStatic[1])
    //println("minValue的值是$minValue")

    val latitude = Latitude.ofDouble(3.0)
    val latitude2 = Latitude.ofLatitude(latitude)

    println(latitude)
    println(latitude2)
    println(Latitude.TAG)

}

//java 里面的静态方法
class Latitude private constructor(val value: Double) {
    companion object {
        @JvmStatic
        fun ofDouble(double: Double): Latitude {
            return Latitude(double)
        }

        //todo copy代码
        fun ofLatitude(latitude: Latitude): Latitude {
            return Latitude(latitude.value)
        }

        @JvmField
        val TAGFild: String = "Latitude"
        @JvmStatic
        val TAG: String = "Latitude"
    }

}
 