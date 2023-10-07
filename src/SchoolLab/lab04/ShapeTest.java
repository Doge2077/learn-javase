package SchoolLab.lab04;


import javafx.scene.shape.Circle;

public class ShapeTest {

    interface Shape {
        double area(double param);
    }

    public static class Square implements Shape {
        @Override
        public double area(double side) {
            return side * side;
        }
    }

    public static class Circle implements Shape {
        @Override
        public double area(double radius) {
            return Math.PI * radius * radius;
        }
    }
    public static void main(String[] args) {
        Square square = new Square();
        double squareArea = square.area(2);
        System.out.println("边长为2的正方形面积为：" + squareArea);
        Circle circle = new Circle();
        double circleArea = circle.area(3);
        System.out.println("半径为3的圆形面积为：" + circleArea);
    }
}
