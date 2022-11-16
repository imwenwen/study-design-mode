package cn.imwenwen.抽象工厂模式;

import cn.imwenwen.抽象工厂模式.pojo.School;
import cn.imwenwen.抽象工厂模式.pojo.User;
import cn.imwenwen.抽象工厂模式.school.SchoolServer;
import cn.imwenwen.抽象工厂模式.user.UserServer;

/**
 * @author chenwenwei
 * 1.优点
 * 降低耦合
 *  抽象工厂模式将具体产品的创建延迟到具体工厂的子类中，这样将对象的创建封装起来，可以减少客户端与具体产品类之间的依赖，从而使系统耦合度低，这样更有利于后期的维护和扩展；
 * 更符合开-闭原则
 *  新增一种产品类时，只需要增加相应的具体产品类和相应的工厂子类即可
 *   简单工厂模式需要修改工厂类的判断逻辑
 * 符合单一职责原则
 *  每个具体工厂类只负责创建对应的产品
 *   简单工厂中的工厂类存在复杂的switch逻辑判断
 * 不使用静态工厂方法，可以形成基于继承的等级结构。
 *   简单工厂模式的工厂类使用静态工厂方法
 * 2.缺点
 * 抽象工厂模式很难支持新种类产品的变化。
 *  这是因为抽象工厂接口中已经确定了可以被创建的产品集合，如果需要添加新产品，此时就必须去修改抽象工厂的接口，这样就涉及到抽象工厂类的以及所有子类的改变，这样也就违背了“开发——封闭”原则。
 *  对于新的产品族符合开-闭原则；对于新的产品种类不符合开-闭原则，这一特性称为开-闭原则的倾斜性。
 * 3. 应用场景
 * 在了解了优缺点后，我总结了工厂方法模式的应用场景：
 * 一个系统不要求依赖产品类实例如何被创建、组合和表达的表达，这点也是所有工厂模式应用的前提。
 * 这个系统有多个系列产品，而系统中只消费其中某一系列产品
 * 系统要求提供一个产品类的库，所有产品以同样的接口出现，客户端不需要依赖具体实现。
 */
public class AbstractFactory {
    public static void main(String[] args) throws Exception {
        User user =new User();
        ReflectFactory reflectFactory =new ReflectFactory();
        UserServer userServer = reflectFactory.createUserServer();
        userServer.insert(user);
        userServer.getUser("1");


        School school =new School();
        SchoolServer schoolServer = reflectFactory.createSchoolServer();
        schoolServer.insert(school);
        schoolServer.getSchool("1");
    }
}
