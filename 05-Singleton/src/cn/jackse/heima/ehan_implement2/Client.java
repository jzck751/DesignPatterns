package cn.jackse.heima.ehan_implement2;

/**
 * @author Jack
 * @version 1.0
 * @description: 测试类
 * @date 2021/10/27 19:39
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();

        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
    }
}
