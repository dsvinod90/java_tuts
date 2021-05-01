import java.util.Scanner;

public class GreatestCommonDivisor {
  public static Scanner scanner = new Scanner(System.in);

  public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
    if(firstNumber < 1 || secondNumber < 1) {
      return -1;
    }

    int smallestNumber = Math.min(firstNumber, secondNumber);
    int gcd = 0;
    for(int i = 1; i <= smallestNumber; i++) {
      if((firstNumber % i == 0) && (secondNumber % i == 0)) {
        gcd = i;
      }
    }

    return gcd;
  }

  public static void main(String[] args) {
    System.out.print("Enter the first number: ");
    int firstNumber = scanner.nextInt();
    System.out.print("Enter the second number: ");
    int secondNumber = scanner.nextInt();
    int gcd = getGreatestCommonDivisor(firstNumber, secondNumber);
    if(gcd == -1) {
      System.out.println("Please check one of the inputs. Inputs should be greater than zero.");
    } else {
      System.out.println("The greatest common divisor of " + firstNumber + " and " + secondNumber + " is : " + gcd);
    }
  }
}
