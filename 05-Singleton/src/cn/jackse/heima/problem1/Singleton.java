package cn.jackse.heima.problem1;

import java.io.Serializable;

/**
 * @author Jack
 * @version 1.0
 * @description: 使用静态内部类方式模拟破坏单例模式
 * @date 2021/10/27 20:33
 */
public class Singleton implements Serializable {
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

    /**
     * 当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回
     * @return
     */
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
