package cn.jackse.heima.ehan_implement1;

/**
 * @author Jack
 * @version 1.0
 * @description: 静态成员变量
 * @date 2021/10/27 19:24
 */
public class Singleton {

    /**
     * 1.构造私有方法
     */
    private Singleton() {}

    /**
     * 2.在本类中创建本类对象
     */
    private static Singleton instance = new Singleton();

    /**
     * 3.提供一个公共的访问方式，供外界访问
     */
    public static Singleton getInstance() {
        return instance;
    }
}
