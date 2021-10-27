package cn.jackse.heima.ehan_implement2;

/**
 * @author Jack
 * @version 1.0
 * @description: 饿汉式-方式2：静态代码块
 * @date 2021/10/27 19:37
 */
public class Singleton {

    /**
     * 1.私有构造方法
     */
    private Singleton(){}

    /**
     * 2.创建成员变量
     */
    private static Singleton instance;

    /**
     * 3.静态代码块赋值
     */
    static{
        instance = new Singleton();
    }

    /**
     * 4.提供外界访问方法
     */
    public static Singleton getInstance() {
        return instance;
    }
}
