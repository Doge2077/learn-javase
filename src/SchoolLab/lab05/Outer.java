package SchoolLab.lab05;

public class Outer {
    private int a   ;
    void output() {
        System.out.println("a = " + a);
    }

    class Inner{
        void out() {
            a = 114;
            output();
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner1 = outer.new Inner();
        inner1.out();

        Inner inner2 = new Outer().new Inner();
        inner2.out();
    }
}
