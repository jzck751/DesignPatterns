package cn.jackse.demo4.after;

/**
 * @author Jack
 * @version 1.0
 * @description: TODO
 * @date 2021/10/26 21:40
 */
public class ChuanZhiSafetyDoor implements AntiTheft,WaterProof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
