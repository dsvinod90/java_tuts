import java.util.Scanner;

public class LargestPrime {
  public static Scanner scanner = new Scanner(System.in);

  public static int getLargestPrime(int number) {
    if(number < 1) {
      return -1;
    }
    int maxPrime = 2;
    while(number % 2 == 0) {
      number /= 2;
    }
    for(int i = 3; i <= number; i += 2) {
      while(number % i == 0) {
        maxPrime = i;
        number /= i;
      }
    }
    return maxPrime;
  }

  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    int number = scanner.nextInt();
    int maxPrimeNumber = getLargestPrime(number);
    if(maxPrimeNumber == -1) {
      System.out.println("Invalid number");
    } else {
      System.out.println("The largest prime number = " + maxPrimeNumber);
    }
  }
}
