package cn.jackse;

/**
 * @author Jack
 * @version 1.0
 * @description: TODO
 * @date 2021/10/12 16:21
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start...");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1和obj2是相同的实例");
        } else {
            System.out.println("obj1和obj2是不同同的实例");
        }

        System.out.println("End...");
    }
}
