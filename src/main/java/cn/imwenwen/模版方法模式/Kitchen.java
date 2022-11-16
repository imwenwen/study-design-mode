package cn.imwenwen.模版方法模式;

/**
 * @author chenwenwei
 * 1.优点
 * 提高代码复用性
 *  将相同部分的代码放在抽象的父类中
 * 提高了拓展性
 *  将不同的代码放入不同的子类中，通过对子类的扩展增加新的行为
 * 实现了反向控制
 *  通过一个父类调用其子类的操作，通过对子类的扩展增加新的行为，实现了反向控制 & 符合“开闭原则”
 * 2.缺点
 * 引入了抽象类，每一个不同的实现都需要一个子类来实现，导致类的个数增加，从而增加了系统实现的复杂度。
 * 3.应用场景
 * 一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现；
 * 各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复；
 * 控制子类的扩展
 */
public class Kitchen {
    public static void main(String[] args) {
        //炒包菜
        CookBaoCai cookBaoCai = new CookBaoCai();
        cookBaoCai.cookProcess();

        //炒茄子
        CookQieZi cookQieZi = new CookQieZi();
        cookQieZi.cookProcess();
    }
}
