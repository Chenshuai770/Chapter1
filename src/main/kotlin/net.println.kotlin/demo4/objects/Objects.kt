package net.println.kotlin.demo4.objects

/**
 * Created by ChenShuai on 2018/7/22
 */

class DriverfromObj
//卸载和非限载方法
interface OnExternalDriverMountListener{
    fun onMount(driver: DriverfromObj)
    fun unMount(driver: DriverfromObj)
}

abstract class Player

object MusicPlayer: Player(), OnExternalDriverMountListener {
    override fun onMount(driver: DriverfromObj) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unMount(driver: DriverfromObj) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    val state: Int = 0

    fun play(url: String): Unit {

    }

    fun stop(): Unit {

    }
}