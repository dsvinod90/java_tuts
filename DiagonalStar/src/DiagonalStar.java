import java.util.Scanner;

public class DiagonalStar {
  public static Scanner scanner = new Scanner(System.in);
  public static void printSquareStar(int number) {
    if(number < 5) {
      System.out.println("Invalid Value");
      return;
    }
    for(int i = 1; i <= number; i++) {
      for(int j = 1; j <= number; j++) {
        if((i == 1) || (i == number)) {
          System.out.print("*");
        } else if((j == 1) || (j == number) || (i == j) || (j == (number - i + 1))) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    printSquareStar(number);
    scanner.close();
  }
}
