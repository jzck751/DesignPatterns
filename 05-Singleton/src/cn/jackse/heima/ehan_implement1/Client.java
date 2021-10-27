package cn.jackse.heima.ehan_implement1;

/**
 * @author Jack
 * @version 1.0
 * @description: 测试类
 * @date 2021/10/27 19:29
 */
public class Client {
    public static void main(String[] args) {

        //构造方法默认公有
        //拿到singleton
        Singleton singleton = Singleton.getInstance();

        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton == singleton1);

    }
}
