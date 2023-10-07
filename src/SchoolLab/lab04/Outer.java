package SchoolLab.lab04;

public class Outer {
    int m = 0;
    void test1() {
        System.out.println("外部成员方法 test1()");
    }

    class Inner {
       int n = 1;
       void show1() {
           System.out.println("外部成员变量 m = " + m);
           test1();
       }

       void show2() {
           System.out.println("内部成员方法 show2()");
       }

    }

    void test2() {
        Inner inner = new Inner();
        System.out.println("内部成员变量 n = " + inner.n);
        inner.show2();
    }
}
