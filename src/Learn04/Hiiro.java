package Learn04;

public class Hiiro implements Cloneable{

    private String name;
    private String sex;
    private Integer age;

    private Hiiro(){}

    public Hiiro(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public void showMe() {
        System.out.println("Hi~ I'm " + getName() + " and I'm a " + getAge() + " years old" + getSex() + "(づ￣ 3￣)づ");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
