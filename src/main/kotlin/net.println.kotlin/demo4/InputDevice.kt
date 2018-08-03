package net.println.kotlin.demo4

/**
 * 输入设备 插头和插座 muke 4-1
 * Created by ChenShuai on 2018/7/22
 */
interface InputDevice {
    fun input(event:Any)
}

interface USBInputDevice:InputDevice

interface BLEInputDevice:InputDevice