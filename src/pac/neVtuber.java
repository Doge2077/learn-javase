package pac;

public class neVtuber extends AbVtuber{

    public neVtuber(String name, int age, String sex, boolean reborn) {
        super(name, age, sex, reborn);
    }

    @Override
    public void show() {
        System.out.println(this.toString());
    }
}
