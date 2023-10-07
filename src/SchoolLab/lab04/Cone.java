package SchoolLab.lab04;

class Cone implements Shape {
  private double radius;
  private double height;

  public Cone(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  public double area() {
    double slantHeight = Math.sqrt(radius * radius + height * height);
    return PI * radius * (radius + slantHeight);
  }

  public double volume() {
    return (PI * radius * radius * height) / 3;
  }
}