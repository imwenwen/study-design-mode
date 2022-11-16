package cn.imwenwen.简单工厂模式;

/**
 * @author chenwenwei
 *
 * 1.优点
 * 将创建实例的工作与使用实例的工作分开，使用者不必关心类对象如何创建，实现了解耦；
 * 把初始化实例时的工作放到工厂里进行，使代码更容易维护。 更符合面向对象的原则 & 面向接口编程，而不是面向实现编程。
 * 2.缺点
 * 工厂类集中了所有实例（产品）的创建逻辑，一旦这个工厂不能正常工作，整个系统都会受到影响；
 * 违背“开放 - 关闭原则”，一旦添加新产品就不得不修改工厂类的逻辑，这样就会造成工厂逻辑过于复杂。
 * 简单工厂模式由于使用了静态工厂方法，静态方法不能被继承和重写，会造成工厂角色无法形成基于继承的等级结构。
 * 3.应用场景
 * 客户如果只知道传入工厂类的参数，对于如何创建对象的逻辑不关心时；
 * 当工厂类负责创建的对象（具体产品）比较少时
 */
public class SimpleFactoryPattern {
    public static void main(String[] args) {
       ProductFactory factory =new ProductFactory();
        try {
            factory.manuFacture("A").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }

        try {
            factory.manuFacture("B").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }

        try {
            factory.manuFacture("C").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }

        try {
            factory.manuFacture("D").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }
    }
}
