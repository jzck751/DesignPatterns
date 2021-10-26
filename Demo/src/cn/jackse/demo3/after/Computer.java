package cn.jackse.demo3.after;

import java.lang.management.MemoryMXBean;

/**
 * @author Jack
 * @version 1.0
 * @description: 计算机类
 * @date 2021/10/26 21:16
 */
public class Computer {
    private Cpu cpu;
    private Memory memory;
    private HardDisk hardDisk;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void run() {
        System.out.println("运行计算机");
        String data = hardDisk.get();
        System.out.println("从硬盘获取的数据为:" + data);
        cpu.run();
        memory.save();
    }
}
