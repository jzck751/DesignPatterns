package cn.jackse.demo3.after;

/**
 * @author Jack
 * @version 1.0
 * @description: 金士顿内存条
 * @date 2021/10/26 20:58
 */
public class KingStoneMemory implements Memory{
    @Override
    public void save(){
        System.out.println("使用金士顿内存条");
    }
}
