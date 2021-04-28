import java.util.Scanner;

public class DigitSum {
  public static int sumDigits(int number) {
    if(number < 10) {
      return -1;
    }
    int sum = 0;
    do{
      int digit = number % 10;
      number = number / 10;
      sum += digit;
    } while(number > 0);
    return sum;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a number greater than 10: ");
    int number = scanner.nextInt();
    int sum = sumDigits(number);
    if(sum == -1) {
      System.out.println("Invalid input. Please enter a number greater than 10");
    } else {
      System.out.println("Sum of digits of " + number + " is: " + sum);
    }
  }
}
