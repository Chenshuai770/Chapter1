package net.println.kotlin.demo4.statci;

/**
 * Created by ChenShuai on 2018/7/22
 * @JvmStatic 和 @JvmField的方法的区别
 */
public class StaticJava {
    public static void main(String[] args){
        Latitude latitude = Latitude.ofDouble(3.0); //todo 注意看kotlin在该方法上有一个@JvmStatic注解,则可以不实际写伴生对象
        Latitude latitudeCopy = Latitude.Companion.ofLatitude(latitude); //todo 注意看kotlin在该方法上有注解,则可以不实际写伴生对象
        System.out.println(Latitude.Companion.getTAG());
        System.out.println(Latitude.TAGFild);
    }
}
