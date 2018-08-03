package net.println.kotlin.demo4.objects;

/**
 * Created by ChenShuai on 2018/7/22
 * kotlin object关键字对于的单例
 */
public class MusicPlayerJava {
    public static MusicPlayerJava INSTANCE=new MusicPlayerJava();

    private MusicPlayerJava() {
    }
}
