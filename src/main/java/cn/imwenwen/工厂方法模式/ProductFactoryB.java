package cn.imwenwen.工厂方法模式;

/**
 * @author chenwenwei
 */
public  class ProductFactoryB extends ProductFactory{

    @Override
    public Product manuFacture() {
        return new ProductB();
    }
}
