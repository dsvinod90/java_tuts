import java.util.Arrays;
import java.util.Scanner;

public class ReversedArray {
  public static Scanner scanner = new Scanner(System.in);
  private static void reverse(int[] numbers) {
    System.out.println("Provided Array: " + Arrays.toString(numbers));
    int countOfNumbers = numbers.length;
    int halfSet = countOfNumbers / 2;
    for (int i = 0; i < halfSet; i++) {
      int temp = numbers[i];
      numbers[i] = numbers[(countOfNumbers - i) - 1];
      numbers[(countOfNumbers - i) - 1] = temp;
    }
    System.out.println("Reversed Array: " + Arrays.toString(numbers));
  }
  public static void main(String[] args) {
    System.out.print("Enter the count of numbers in the array: ");
    int count = scanner.nextInt();
    int[] numbers = new int[count];
    System.out.println("Enter the numbers: ");
    for(int i = 0; i < count; i++) {
      numbers[i] = scanner.nextInt();
    }
    reverse(numbers);
  }
}
