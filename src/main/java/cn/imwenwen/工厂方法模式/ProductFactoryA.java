package cn.imwenwen.工厂方法模式;

/**
 * @author chenwenwei
 */
public  class ProductFactoryA  extends ProductFactory{

    @Override
    public Product manuFacture() {
        return new ProductA();
    }
}
