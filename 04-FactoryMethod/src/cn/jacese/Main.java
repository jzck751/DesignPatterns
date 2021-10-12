package cn.jacese;

import cn.jacese.framework.Factory;
import cn.jacese.framework.Product;
import cn.jacese.idcard.IDCardFactory;

/**
 * @author Jack
 * @version 1.0
 * @description: TODO
 * @date 2021/9/30 19:08
 */
public class Main {
    public static void main(String[] args) {
        Factory factory  = new IDCardFactory();
        Product card1 = factory.create("小红");
        Product card2 = factory.create("小明");
        Product card3 = factory.create("小刚");

        card1.use();
        card2.use();
        card3.use();
    }
}
