package SchoolLab.lab03;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this(1, 1);
    }

    void show() {
        System.out.println("x: " + x + " y: " + y);
    }


}
