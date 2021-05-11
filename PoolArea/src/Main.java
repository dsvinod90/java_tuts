import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("For Cuboid: ");
    System.out.print("Enter length of cuboid: ");
    double lengthCuboid = scanner.nextDouble();
    System.out.print("Enter width of the cuboid: ");
    double widthCuboid = scanner.nextDouble();
    System.out.print("Enter height of the cuboid: ");
    double heightCuboid = scanner.nextDouble();
    Cuboid cuboid = new Cuboid(lengthCuboid, widthCuboid, heightCuboid);
    System.out.println("Surface of the cuboid = " + cuboid.getArea());
    System.out.println("Volume of the cuboid = " + cuboid.getVolume());
    System.out.println();

    System.out.println("For Rectangle: ");
    System.out.print("Enter the length of the rectangle: ");
    double lengthRectangle = scanner.nextDouble();
    System.out.print("Enter the width of the rectangle: ");
    double widthRectangle = scanner.nextDouble();
    Rectangle rectangle = new Rectangle(lengthRectangle, widthRectangle);
    System.out.println("Perimeter of the rectangle = " + rectangle.getPerimeter());
    System.out.println("Area of the rectangle = " + rectangle.getArea());
    scanner.close();
  }
}
