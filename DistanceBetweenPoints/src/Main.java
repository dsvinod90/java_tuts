import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter the coordinates of the first point: ");
    System.out.print("Enter the x co-ordinate: ");
    int x1 = scanner.nextInt();
    System.out.print("Enter the y co-ordinate: ");
    int y1 = scanner.nextInt();
    System.out.println();
    System.out.println("Enter the coordinates of the second point: ");
    System.out.print("Enter the x co-ordinate: ");
    int x2 = scanner.nextInt();
    System.out.print("Enter the y co-ordinate: ");
    int y2 = scanner.nextInt();

    Point first = new Point(x1, y1);
    Point second = new Point(x2, y2);
    System.out.println("Distance of point(" + x1 + "," + y1 + ") from origin(0,0) = " + first.distance());
    System.out.println("Distance of point(" + x1 + "," + y1 + ") from point(" + x2 + "," + y2 + ") = " + first.distance(second));
    System.out.println("Distance of point(" + x1 + "," + y1 + ") from point(2, 2) = " + first.distance(2, 2));
    Point point = new Point();
    System.out.println("Distance of new point from origin(0,0) = " + point.distance());
    scanner.close();
  }
}
