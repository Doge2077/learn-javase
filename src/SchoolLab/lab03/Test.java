package SchoolLab.lab03;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(1, 2, 3, 4);
        Rectangle rectangle2 = new Rectangle(11.4, 5.14);
        Rectangle rectangle3 = new Rectangle();

        rectangle1.show();
        rectangle2.show();
        rectangle3.show();

        System.out.println(rectangle1.area());
        System.out.println(rectangle2.area());
        System.out.println(rectangle3.area());

    }
}
