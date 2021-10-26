package cn.jackse.demo3.before;

/**
 * @author Jack
 * @version 1.0
 * @description: TODO
 * @date 2021/10/26 21:03
 */
public class ComputerDemo {
    public static void main(String[] args) {

        //创建组件对象
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        IntelCpu cpu = new IntelCpu();
        KingStoneMemory memory = new KingStoneMemory();

        //创建计算机对象
        Computer computer = new Computer();

        //组装计算机
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setKingstoneMemory(memory);

        //运行计算机
        computer.run();
    }
}
