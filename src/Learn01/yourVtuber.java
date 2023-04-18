package Learn01;

public class yourVtuber extends Vtubers implements chat{
    public yourVtuber(String name, int age, String sex) {
        super(name, age, sex);
    }

    public yourVtuber() {
    }

    @Override
    public void chat_eat() {
        System.out.println("I like eat apples .");
    }
}
