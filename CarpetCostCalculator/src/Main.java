import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter the length of the floor: ");
    double length = scanner.nextDouble();
    System.out.print("Enter the width of the floor: ");
    double width = scanner.nextDouble();
    System.out.print("Enter the cost per square unit of the floor: ");
    double cost = scanner.nextDouble();

    Carpet carpet = new Carpet(cost);
    Floor floor = new Floor(length, width);
    Calculator calculator = new Calculator(floor, carpet);
    System.out.println("Total cost = " + calculator.getTotalCost());
    scanner.close();
  }
}
