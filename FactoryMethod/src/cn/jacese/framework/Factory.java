package cn.jacese.framework;

/**
 * @author Jack
 * @version 1.0
 * @description: TODO
 * @date 2021/9/30 18:56
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
