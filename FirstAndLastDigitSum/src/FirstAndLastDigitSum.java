import java.util.Scanner;

public class FirstAndLastDigitSum {
  public static int sumFirstAndLastDigit(int number) {
    if(number < 0) {
      return -1;
    } else if(number > 0 && number < 10) {
      return number;
    }
    int firstDigit = 0;
    int lastDigit = number % 10;
    while(number > 0) {
      firstDigit = number%10;
      number /= 10;
    }
    return(firstDigit + lastDigit);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a non-negative number: ");
    int number = scanner.nextInt();
    System.out.println("Sum of first and digit of the number = " + sumFirstAndLastDigit(number));
    scanner.close();
  }
}
