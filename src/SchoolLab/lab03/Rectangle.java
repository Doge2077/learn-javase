package SchoolLab.lab03;

public class Rectangle extends Point {
    private double length;
    private double width;

    public Rectangle(double x, double y, double length, double width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this(0, 0, 10, 10);
    }

    @Override
    void show() {
        super.show();
        System.out.println("length: " + length + " width: " + width);
    }

    double area() {
        return length * width;
    }
}
