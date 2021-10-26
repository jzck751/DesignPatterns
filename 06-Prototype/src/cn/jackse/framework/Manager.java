package cn.jackse.framework;

import java.util.HashMap;

/**
 * @author Jack
 * @version 1.0
 * @description: Manager
 * @date 2021/10/13 17:36
 */
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name,Product proto){
        showcase.put(name,proto);
    }

    public Product create(String protoname){
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
