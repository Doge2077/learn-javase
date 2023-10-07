package SchoolLab.lab04;

class Cube implements Shape {
  private double side;

  public Cube(double side) {
    this.side = side;
  }

  public double area() {
    return 6 * side * side;
  }

  public double volume() {
    return side * side * side;
  }
}