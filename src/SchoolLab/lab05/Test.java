package SchoolLab.lab05;

public class Test {
    public static void main(String[] args) {
        Outer Out1 = new Outer();
        Outer.Inner Inner_One = Out1.new Inner();
        System.out.println(Inner_One.Linking());
    }
}
