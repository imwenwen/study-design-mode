package cn.imwenwen.模版方法模式;

/**
 * @author chenwenwei
 * 包菜实体
 */
public class CookBaoCai extends Cook{
    @Override
    public void pourVegetable() {
        System.out.println("第三步，倒入包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("第四步，加入适量盐");
    }
}
