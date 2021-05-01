import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    SimpleCalculator calculator = new SimpleCalculator();
    System.out.print("Enter the first number: ");
    double firstNumber = scanner.nextDouble();
    System.out.print("Enter the second number: ");
    double secondNumber = scanner.nextDouble();
    calculator.setFirstNumber(firstNumber);
    calculator.setSecondNumber(secondNumber);
    calculator.thirdNumber = 9.87;
    System.out.println("Value of public variable: " + calculator.getThirdNumber());
    System.out.println("Performing basic operations on " + firstNumber + " and " + secondNumber + ": ");
    System.out.println("=========================================================================");
    System.out.println("Result of addition: " + calculator.getAdditionalResult());
    System.out.println("Result of subtraction: " + calculator.getSubtractionResult());
    System.out.println("Result of multiplication: " + calculator.getMultiplicationResult());
    System.out.println("Result of division: " + calculator.getDivisionResult());
  }
}
