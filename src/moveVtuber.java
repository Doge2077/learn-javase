public class moveVtuber extends Vtubers implements run, chat{
    public moveVtuber(String name, int age, String sex) {
        super(name, age, sex);
    }

    public moveVtuber() {
    }

    @Override
    public void walk() {
        System.out.println("walk");
    }

    @Override
    public void chat_eat() {
        System.out.println("I like eat watermelon.");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void fast_walk() {
        System.out.println("fast walk");
    }

    @Override
    public void slow_walk() {
        System.out.println("slow walk");
    }
}
