import java.util.Scanner;

public class NumberPalindrome {
  public static boolean isPalindrome(int number) {
    int originalNumber = number;
    if((number > 0 && number < 10) || (number < 0 && number > -10)) {
      return false;
    } else if(number < -10) {
      originalNumber *= -1;
    }
    int reversedNumber = 0;
    do {
      // number = 1234
      int digit = originalNumber % 10;
      reversedNumber = (reversedNumber * 10) + digit;
      originalNumber /= 10;
    }while(originalNumber > 0);
    if(number < 0) {
      return (number*-1) == reversedNumber;
    } else {
      return number == reversedNumber;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    System.out.println("Is " + number + " a palindrome? : " + isPalindrome(number));
    scanner.close();
  }
}
