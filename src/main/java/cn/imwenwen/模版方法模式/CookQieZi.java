package cn.imwenwen.模版方法模式;

/**
 * @author chenwenwei
 * 茄子实体
 */
public class CookQieZi extends Cook{
    @Override
    public void pourVegetable() {
        System.out.println("第三步，倒入茄子");
    }

    @Override
    public void pourSauce() {
        System.out.println("第四步，加入适量水");
    }
}
