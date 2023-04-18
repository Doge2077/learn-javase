public class Vtubers {
    private String name;
    private int age;
    private String sex;

    public Vtubers(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Vtubers(){  // 默认无参构造
        this.name = "LYS";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    void show(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);
    }

    @Override
    public String toString() {
        return this.name + this.age + this.sex;
    }


}
