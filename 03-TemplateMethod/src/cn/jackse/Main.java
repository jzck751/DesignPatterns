package cn.jackse;

/**
 * @author Jack
 * @version 1.0
 * @description: TODO
 * @date 2021/9/29 16:18
 */
public class Main {
    public static void main(String[] args) {
        //生成一个带有H的CharDisplay实例
        CharDisplay d1 = new CharDisplay('H');
        //生成一个持有“Hello，world”字符串的StringDisplay实例
        StringDisplay d2 = new StringDisplay("Hello,world");
        //生成一个持有“你好，世界”的StringDisplay
        StringDisplay d3 = new StringDisplay("你好，世界");

        d1.display();
        d2.display();
        d3.display();
    }
}
