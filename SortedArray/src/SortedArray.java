import java.util.Scanner;

public class SortedArray {
  public static Scanner scanner = new Scanner(System.in);
  public int[] getIntegers() {
    System.out.println("Enter five numbers: ");
    int[] numbersArray = new int[5];
    for(int i = 0; i < 5; i++) {
      numbersArray[i] = scanner.nextInt();
    }
    return numbersArray;
  }
  public int[] sortIntegers(int[] numbersArray) {
    for(int i = 0; i < numbersArray.length; i++) {
      for(int j = i + 1; j < numbersArray.length; j++) {
        if(numbersArray[j] > numbersArray[i]) {
          int temp = numbersArray[i];
          numbersArray[i] = numbersArray[j];
          numbersArray[j] = temp;
        }
      }
    }
    return numbersArray;
  }

  public void printArray(int[] unsortedArray) {
    int[] sortedArray = sortIntegers(unsortedArray);
    for(int i = 0; i < sortedArray.length; i++) {
      System.out.println("Element " + i + " contains " + sortedArray[i]);
    }
  }
}
