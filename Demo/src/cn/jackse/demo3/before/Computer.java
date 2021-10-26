package cn.jackse.demo3.before;

/**
 * @author Jack
 * @version 1.0
 * @description: 测试类
 * @date 2021/10/26 21:00
 */
public class Computer {
    private IntelCpu cpu;
    private KingStoneMemory kingstoneMemory;
    private XiJieHardDisk hardDisk;

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingStoneMemory getKingstoneMemory() {
        return kingstoneMemory;
    }

    public void setKingstoneMemory(KingStoneMemory kingstoneMemory) {
        this.kingstoneMemory = kingstoneMemory;
    }

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void run() {
        System.out.println("运行计算机");
        String data = hardDisk.get();
        System.out.println("从硬盘获取的数据为:" + data);
        cpu.run();
        kingstoneMemory.save();
    }
}
