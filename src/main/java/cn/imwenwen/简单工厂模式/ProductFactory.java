package cn.imwenwen.简单工厂模式;

/**
 * @author chenwenwei
 */
public class ProductFactory {
    public  Product manuFacture(String productName){
        switch (productName){
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            case "C":
                return new ProductC();
            default:
                return null;
        }
    }
}
