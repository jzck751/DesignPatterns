package cn.jacese.idcard;

import cn.jacese.framework.Factory;
import cn.jacese.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @description: TODO
 * @date 2021/9/30 19:03
 */
public class IDCardFactory extends Factory {

    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners(){
        return owners;
    }
}
