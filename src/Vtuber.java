public class Vtuber {
    String name = init();
    Integer age;
    String sex;

    static String vtbinfo = static_init();

    public Vtuber(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    {
        System.out.println("普通代码块块1");
    }

    public Vtuber(){
        System.out.println("构造方法");
    }

    String init(){
        System.out.println("成员变量初始化");
        return "Hiiro";
    }

    static String static_init(){
        System.out.println("静态成员变量初始化");
        return "This is vtb info .";
    }

    {
        System.out.println("普通代码块块2");
    }

    static {
        System.out.println("静态代码块块");
    }

    void show_self(){
        System.out.println("I'm " + this.name + " who is a " + this.age + " years old " + this.sex + " .");
    }

    int sum(int a, int b){
        return a + b;
    }

    double sum(double a, double b){
        return a + b;
    }

    void modify_name(Vtuber v){
        v.name = "hiiro";
    }

}


