package cn.jackse.demo4.before;

/**
 * @author Jack
 * @version 1.0
 * @description: 测试类
 *               违背了接口隔离原则
 * @date 2021/10/26 21:31
 */
public class Client {
    public static void main(String[] args) {
        HeiMaSafetyDoor door = new HeiMaSafetyDoor();

        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }
}
