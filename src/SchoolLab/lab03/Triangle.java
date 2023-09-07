package SchoolLab.lab03;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    private boolean isTriangle;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.isTriangle = checkTriangleValidity();
    }

    public void setSides(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.isTriangle = checkTriangleValidity();
    }

    public double calculateArea() throws IllegalAccessException {
        if (!isTriangle) {
            throw new IllegalAccessException("Triangle is invalided.");
        }

        double semiPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) *
                (semiPerimeter - side2) * (semiPerimeter - side3));
        return area;
    }

    private boolean checkTriangleValidity() {
        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2);
    }
}
