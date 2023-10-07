package SchoolLab.lab04;

class Cylinder implements Shape {
  private double radius;
  private double height;

  public Cylinder(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  public double area() {
    return 2 * PI * radius * radius + 2 * PI * radius * height;
  }

  public double volume() {
    return PI * radius * radius * height;
  }
}