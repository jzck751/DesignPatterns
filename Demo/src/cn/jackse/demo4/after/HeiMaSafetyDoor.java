package cn.jackse.demo4.after;

import cn.jackse.demo4.before.SafetyDoor;

/**
 * @author Jack
 * @version 1.0
 * @description: 黑马品牌安全门
 * @date 2021/10/26 21:30
 */
public class HeiMaSafetyDoor implements AntiTheft,FireProof,WaterProof {

    @Override
    public void antiTheft() {
        System.out.println("防盗接口");
    }

    @Override
    public void fireProof() {
        System.out.println("防火接口");
    }

    @Override
    public void waterProof() {
        System.out.println("防水接口");
    }
}
