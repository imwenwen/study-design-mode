package cn.imwenwen.模版方法模式;

/**
 * @author chenwenwei
 */
public abstract class Cook {

    public final void cookProcess(){
        this.pourOil();
        this.heatOil();
        this.pourVegetable();
        this.pourSauce();
        this.fry();
    }

    public void pourOil(){
        System.out.println("第一步，倒入油");
    }

    public void heatOil(){
        System.out.println("第二步，热油");
    }

    //第三步 倒入蔬菜
    public abstract void pourVegetable();

    //第四步 调料
    public abstract void pourSauce();

    public void fry(){
        System.out.println("最后一步，炒");
    }
}
