public class ReVtuber extends Vtubers{  // 继承自 Vtuber 父类

    boolean reborn = true;

    public ReVtuber(){
        this.reborn = true;
    }

    public ReVtuber(String name, int age, String sex, boolean reborn) {  // 重写父类的有参构造
        super(name, age, sex);  // 直接调用父类有参构造
        this.reborn = reborn;   // 子类新增的构造方法
    }

    @Override
    void show() {  // 重写父类的 show() 方法
        super.show();
        System.out.println(this.reborn);
    }
}
