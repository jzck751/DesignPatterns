package cn.jackse.heima.lanhan_implement1;

/**
 * @author Jack
 * @version 1.0
 * @description: TODO
 * @date 2021/10/27 19:59
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
    }
}
