package cn.jackse.heima.lanhan_implement1;

/**
 * @author Jack
 * @version 1.0
 * @description: 懒汉式
 * @date 2021/10/27 19:55
 */
public class Singleton {

    /**
     * 1.私有构造方法
     */
    private Singleton() {
    }

    /**
     * 2.创建成员变量
     */
    private static Singleton instance;

    /**
     * 3.对外提供访问方式
     */
    public static synchronized Singleton getInstance() {
        //如果调用方法的时候instance为空，则创建一个，否则，直接返回
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
