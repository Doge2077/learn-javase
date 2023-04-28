package Learn03;

public class Vtb <T>{

    String name;
    String id;

    T value;  // 根据提供类型自动转换

    public Vtb() { }

    public Vtb(String name, String id, T value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    public void show_vtbinfo(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.value);
    }

    public T getValue() {
        return value;
    }
}
