package cn.jackse.demo3.after;

/**
 * @author Jack
 * @version 1.0
 * @description: 测试类
 * @date 2021/10/26 21:19
 */
public class ComputerDemo {
    public static void main(String[] args) {

        //创建计算机组件对象
        HardDisk hardDisk = new XiJieHardDisk();
        Cpu cpu = new IntelCpu();
        Memory memory = new KingStoneMemory();

        //创建计算机对象
        Computer computer = new Computer();

        //组装计算机
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        //运行计算机
        computer.run();

    }
}
