package pac;

public abstract class AbVtuber {
    protected String name;
    protected int age;
    protected String sex;
    protected boolean reborn;
    protected AbVtuber(String name, int age, String sex, boolean reborn) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.reborn = reborn;
    }

    public abstract void show();  // 抽象类可以具有抽象方法，子类必须实现所有的抽象方法
}
