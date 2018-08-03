package net.println.kotlin.demo4

/**
 * Created by ChenShuai on 2018/7/30
 * sealed 修饰的方法相当于privite ,防止代码被修改
 */
sealed class PlayerCmd{
    class Play(val url:String,val position:Long):PlayerCmd()

    class Seek(val position: Long):PlayerCmd()

    object Pause : PlayerCmd()
    object Resume : PlayerCmd()
    object Stop : PlayerCmd()
}

class videoPlay: PlayerCmd() {
    //无法访问sealed的内部类
}
