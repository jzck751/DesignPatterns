package cn.jackse.exercise3;

/**
 * @author Jack
 * @version 1.0
 * @description: 严谨的Singleton模式
 * @date 2021/10/12 17:29
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("生成了一个实例");
        slowdown();
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
