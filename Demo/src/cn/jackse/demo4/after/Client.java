package cn.jackse.demo4.after;

/**
 * @author Jack
 * @version 1.0
 * @description: 测试类
 * @date 2021/10/26 21:39
 */
public class Client {
    public static void main(String[] args) {
        //创建黑马防盗门对象
        HeiMaSafetyDoor door = new HeiMaSafetyDoor();
        //调用方法
        door.antiTheft();
        door.fireProof();
        door.waterProof();

        System.out.println("华丽分割线");

        //创建传智安全门对象
        ChuanZhiSafetyDoor door1 = new ChuanZhiSafetyDoor();
        door1.antiTheft();
        door1.waterProof();
    }
}
