package SchoolLab.lab03;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3, 4, 5);
        try {
            double area = triangle1.calculateArea();
            System.out.println("Triangle area is " + area);
        } catch (IllegalAccessException e) {
            System.out.println("Error occurred in " + e);
        }

        Triangle triangle2 = new Triangle(3, 4, 1);
        try {
            double area = triangle2.calculateArea();
            System.out.println("Triangle area is " + area);
        } catch (IllegalAccessException e) {
            System.out.println("Error occurred in " + e);
        }
    }

}
