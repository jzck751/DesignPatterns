package cn.jackse.framework;

/**
 * @author Jack
 * @version 1.0
 * @description: Product
 * @date 2021/10/13 17:36
 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}
