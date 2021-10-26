package cn.jackse.demo3.after;

/**
 * @author Jack
 * @version 1.0
 * @description: IntelCpu
 * @date 2021/10/26 20:56
 */
public class IntelCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("使用Intel处理器");
    }
}
