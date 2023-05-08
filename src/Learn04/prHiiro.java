package Learn04;

public class prHiiro {

    private String name;
    private String sex;
    private final Integer age = 114514;
    private static String work = "Vtuber";
    private final static String status = "nya";

    private prHiiro(){}

    private prHiiro(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    private String getName() {
        return name;
    }

    private String getSex() {
        return sex;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setSex(String sex) {
        this.sex = sex;
    }

    private void show(){
        System.out.println(getName() + " " + getSex() + " " + age + " " + work + " " + status);
    }

}
