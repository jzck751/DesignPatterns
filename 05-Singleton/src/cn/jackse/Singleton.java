package cn.jackse;

/**
 * @author Jack
 * @version 1.0
 * @description: TODO
 * @date 2021/10/12 16:17
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("生成了一个实例");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
