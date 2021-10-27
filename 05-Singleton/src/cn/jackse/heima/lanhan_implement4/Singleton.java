package cn.jackse.heima.lanhan_implement4;

/**
 * @author Jack
 * @version 1.0
 * @description: 静态内部类方式
 * @date 2021/10/27 20:18
 */
public class Singleton {

    /**
     * 1.私有构造方法
     */
    private Singleton() {
    }

    /**
     * 2.定义静态内部类
     */
    private static class SingletonHolder {
        //在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 3.提供外界访问方法
     */
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
