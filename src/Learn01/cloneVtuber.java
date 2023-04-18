package Learn01;

public class cloneVtuber extends Vtubers implements Cloneable{
    public cloneVtuber(String name, int age, String sex) {
        super(name, age, sex);
    }

    public cloneVtuber() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {  // 提升 clone 方法的访问权限
        return super.clone();  // 直接调用父类实现即可
    }

    @Override
    public void show() {
        System.out.println("I can clone.");
    }
}
