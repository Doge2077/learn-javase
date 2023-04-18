package Learn01;

public class ReVtuber extends Vtubers{  // 继承自 Learn01.Vtuber 父类

    public boolean reborn = true;

    public ReVtuber(){
        this.reborn = true;
    }

    public ReVtuber(String name, int age, String sex, boolean reborn) {  // 重写父类的有参构造
        super(name, age, sex);  // 直接调用父类有参构造
        this.reborn = reborn;   // 子类新增的构造方法
    }

    @Override
    public void show() {  // 重写父类的 show() 方法  不能降低父类方法的可见性
        super.show();
        System.out.println(this.reborn);
    }
}
