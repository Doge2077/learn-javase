public interface walk extends Action{  // 可继承
    void fast_walk();
    void slow_walk();
    default void moddle_walk(){
        System.out.println("Just walk a little.");
    }
}
