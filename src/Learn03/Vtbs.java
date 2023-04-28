package Learn03;

public class Vtbs <A, B, C>{

    A a;
    B b;
    C c;

    public Vtbs(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void show_vtbsinfo(){
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
    }

}
