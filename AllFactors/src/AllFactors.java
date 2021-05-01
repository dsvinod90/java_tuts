import java.util.Scanner;

public class AllFactors {
  public static Scanner scanner = new Scanner(System.in);

  public static void printFactors(int number) {
    if(number < 1) {
      System.out.println("Invalid Value. Please enter a value greater than 1");
      return;
    }
    for(int i = 1; i <= number; i++) {
      if(number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }

  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    System.out.println("Factors of " + number + " are: ");
    printFactors(number);
    scanner.close();
  }
}
