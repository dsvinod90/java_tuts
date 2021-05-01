import java.util.Scanner;

public class SharedDigit {
  public static Scanner scanner = new Scanner(System.in);
  public static boolean hasSharedDigit(int num1, int num2) {
    if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
      return false;
    }
    int num1LastDigit = num1 % 10;
    int num2LastDigit = num2 % 10;
    int num1FirstDigit = num1 / 10;
    int num2FirstDigit = num2 / 10;
    return (num1FirstDigit == num2FirstDigit ||
        num1FirstDigit == num2LastDigit ||
        num1LastDigit == num2FirstDigit ||
        num1LastDigit == num2LastDigit);
  }

  public static void main(String[] args) {
    System.out.print("Enter the first number: ");
    int firstNumber = scanner.nextInt();
    System.out.print("Enter the second number: ");
    int secondNumber = scanner.nextInt();
    System.out.println("Is there a common digit between the two number? : " + hasSharedDigit(firstNumber, secondNumber));
  }
}
