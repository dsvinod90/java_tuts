import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Cylinder: ");
    System.out.print("Enter the radius of cylinder: ");
    double radius = scanner.nextDouble();
    System.out.print("Enter the height of cylinder: ");
    double height = scanner.nextDouble();
    Cylinder cylinder = new Cylinder(radius, height);
    System.out.println("Surface area of cylinder = " + cylinder.getArea());
    System.out.println("Volume of cylinder = " + cylinder.getVolume());
    System.out.println();

    System.out.println("Circle: ");
    System.out.print("Enter the radius of circle: ");
    double radiusCircle = scanner.nextDouble();
    Circle circle = new Circle(radiusCircle);
    System.out.println("Area of circle: " + circle.getArea());
    scanner.close();
  }
}
