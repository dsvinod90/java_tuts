import java.util.Scanner;

public class InputCalculator {
  public static Scanner scanner = new Scanner(System.in);

  public static void inputThenPrintSumAndAverage() {
    int sum = 0;
    int count = 0;
    double average = 0.0;
    System.out.println("Enter the numbers: ");
    while(scanner.hasNextInt()){
      int number = scanner.nextInt();
      sum += number;
      count++;
    }
    if(count > 0) {
      average = (double)sum / (double)count;
    }
    System.out.println("SUM = " + sum + " AVG = " + String.format("%.2f", average));
    scanner.close();
  }

  public static void main(String[] args) {
    inputThenPrintSumAndAverage();
  }
}
