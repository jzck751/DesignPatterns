package cn.jackse.demo3.after;

/**
 * @author Jack
 * @version 1.0
 * @description: 希捷硬盘
 * @date 2021/10/26 20:52
 */
public class XiJieHardDisk implements HardDisk{

    /**
     * 存储数据的方法
     *
     * @param data
     */
    @Override
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为" + data);
    }

    /**
     * 获取数据的方法
     */
    @Override
    public String get() {
        System.out.println("使用希捷硬盘获取数据");
        return "数据";
    }
}
