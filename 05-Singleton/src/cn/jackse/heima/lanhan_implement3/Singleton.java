package cn.jackse.heima.lanhan_implement3;

/**
 * @author Jack
 * @version 1.0
 * @description: 双重检查锁
 * @date 2021/10/27 20:07
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
    private static volatile Singleton instance;

    /**
     * 3.对外提供访问方式
     */
    public static Singleton getInstance() {
        //第一次判断，如果instance的值不为null，不需要抢占锁，直接返回对象
        if (instance == null) {
            synchronized (Singleton.class) {
                //第二次判断
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
