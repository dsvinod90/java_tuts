import java.util.Scanner;

public class PerfectNumber {
  public static Scanner scanner = new Scanner(System.in);

  public static boolean isPerfectNumber(int number) {
    if(number < 1) {
      return false;
    }
    int sum = 0;
    for(int i = 1; i < number; i++) {
      if(number % i == 0) {
        sum += i;
      }
    }
    return sum == number;
  }

  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    boolean perfect = isPerfectNumber(number);
    if(perfect) {
      System.out.println("The number " + number + " IS A Perfect Number.");
    } else {
      System.out.println("The number " + number + " IS NOT a Perfect Number.");
    }
    scanner.close();
  }
}
