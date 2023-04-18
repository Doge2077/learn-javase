package Learn01;

public class myVtuber extends Vtubers implements chat{

    public myVtuber(String name, int age, String sex) {
        super(name, age, sex);
    }

    public myVtuber() {
    }

    @Override
    public void chat_eat() {  // 在类中实现 chat_eat() 接口
        System.out.println("I like eat bananas .");
    }
}
