package cn.jackse.heima.problem2;

import java.lang.reflect.Constructor;

/**
 * @author Jack
 * @version 1.0
 * @description: 使用反射模拟破坏单例模式
 * @date 2021/10/27 20:55
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //1.获取Singleton的字节码对象
        Class clazz = Singleton.class;
        //2.获取无参构造方法对象
        Constructor cons = clazz.getDeclaredConstructor();
        //3.取消访问检查
        cons.setAccessible(true);
        //4.创建Singleton对象
        Singleton instance1 = (Singleton) cons.newInstance();
        Singleton instance2 = (Singleton) cons.newInstance();

        System.out.println(instance1 == instance2);

    }
}
