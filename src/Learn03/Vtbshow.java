package Learn03;

public class Vtbshow implements vtbIf<Void>{

    String name;
    String sex;

    public Vtbshow(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public Void show_info() {
        System.out.println(this.name + " is " + sex);
        return null;  // Void 类需要返回 null
    }

}
