package SchoolLab.lab04;

public class Test {
  public static void main(String[] args) {
    Cube cube = new Cube(5.0);
    System.out.println("Cube Area: " + cube.area());
    System.out.println("Cube Volume: " + cube.volume());

    Cylinder cylinder = new Cylinder(3.0, 4.0);
    System.out.println("Cylinder Area: " + cylinder.area());
    System.out.println("Cylinder Volume: " + cylinder.volume());

    Cone cone = new Cone(2.0, 6.0);
    System.out.println("Cone Area: " + cone.area());
    System.out.println("Cone Volume: " + cone.volume());
  }
}