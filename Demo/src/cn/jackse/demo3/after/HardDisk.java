package cn.jackse.demo3.after;

/**
 * @author Jack
 * @version 1.0
 * @description: 硬盘接口
 * @date 2021/10/26 21:09
 */
public interface HardDisk {

    /**
     * 存储数据
     * @param data
     */
    public void save(String data);

    /**
     * 获取数据
     * @return
     */
    public String get();

}
