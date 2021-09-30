package cn.jacese.idcard;

import cn.jacese.framework.Product;

/**
 * @author Jack
 * @version 1.0
 * @description: TODO
 * @date 2021/9/30 19:00
 */
public class IDCard extends Product {

    private String owner;

    IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
