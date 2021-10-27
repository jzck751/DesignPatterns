package cn.jackse.heima.problem2;

import java.io.Serializable;

/**
 * @author Jack
 * @version 1.0
 * @description: 使用静态内部类方式模拟破坏单例模式
 * @date 2021/10/27 20:33
 */
public class Singleton implements Serializable {

    private static boolean flag = false;

    /**
     * 1.私有构造方法
     */
    private Singleton() {
        synchronized (Singleton.class) {
            //判断flag的值是否为true,如果为true那么非第一次访问，抛出一个运行时异常
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            //如果flag的值为false，那么是第一次访问，我们将flag设置为true
            flag = true;
        }
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
