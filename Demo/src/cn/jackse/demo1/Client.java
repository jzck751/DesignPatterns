package cn.jackse.demo1;

/**
 * @author Jack
 * @version 1.0
 * @description: 测试类
 * @date 2021/10/26 20:07
 */
public class Client {
    public static void main(String[] args) {
        //1.创建搜狗输入法对象
        SouGouInput input = new SouGouInput();
        //2.创建默认皮肤对象
        //DefaultSkin skin = new DefaultSkin();
        HeiMaSkin skin = new HeiMaSkin();
        //3.将默认皮肤对象设置到搜狗输入法里面
        input.setSkin(skin);
        //4.显示皮肤
        input.display();

    }
}
