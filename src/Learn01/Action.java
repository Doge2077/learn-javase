package Learn01;

public interface Action {
    void walk();

    default void run(){
        System.out.println("RUNNNNNNN");
    }

}
