import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
  public static Scanner scanner = new Scanner(System.in);
  public int readInteger() {
    System.out.print("Enter the number of elements: ");
    return scanner.nextInt();
  }
  public int[] readElements(int numberOfElements) {
    int[] numbers = new int[numberOfElements];
    int i = 0;
    System.out.println("Enter the numbers: ");
    while(i < numberOfElements) {
      numbers[i] = scanner.nextInt();
      i++;
    }
    scanner.close();
    System.out.println("Array of numbers = " + Arrays.toString(numbers));
    return numbers;
  }
  public int findMin(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] > numbers[j]) {
          int temp = numbers[i];
          numbers[i] = numbers[j];
          numbers[j] = temp;
        }
      }
    }
    return numbers[0];
  }
}
