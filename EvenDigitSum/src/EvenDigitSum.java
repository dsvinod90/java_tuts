import java.util.Scanner;

public class EvenDigitSum {
  public static int getEvenDigitSum(int number) {
    if(number < 1) {
      return -1;
    }
    int sum = 0;
    while(number > 0) {
      int digit = number % 10;
      if(digit % 2 == 0) {
        sum += digit;
      }
      number /= 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int number = scanner.nextInt();
    int sum = getEvenDigitSum(number);
    if(sum == -1) {
      System.out.println("Invalid input. The number must be positive");
    } else {
      System.out.println("Sum of even digits of the number = " + sum);
    }
  }
}
