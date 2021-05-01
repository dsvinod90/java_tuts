import java.util.Scanner;

public class NumberToWords {
  public static Scanner scanner = new Scanner(System.in);

  public static void convertNumberToWords(int number) {
    System.out.println("The entered number: " + number);
    if(number < 0) {
      System.out.println("Invalid Value");
      return;
    } else if(number == 0) {
      System.out.println("Zero");
      return;
    }
    int countOfDigitsOfOriginalNumber = countOfDigits(number);
    int reversedNumber = reversedNumber(number);
    int countOfDigitsOfReversedNumber = countOfDigits(reversedNumber);
    String words = "";
    while(reversedNumber > 0) {
      int digit = reversedNumber % 10;
      words += spellDigit(digit);
      reversedNumber /= 10;
    }
    if(countOfDigitsOfReversedNumber < countOfDigitsOfOriginalNumber) {
      int difference = countOfDigitsOfOriginalNumber - countOfDigitsOfReversedNumber;
      String filler = "";
      for(int i = 0; i < difference; i++) {
        filler += "Zero ";
      }
      System.out.println(words + filler);
      return;
    }
    System.out.println(words);
  }

  public static String spellDigit(int digit) {
    switch (digit) {
      case 1:
        return "One ";
      case 2:
        return "Two ";
      case 3:
        return "Three ";
      case 4:
        return "Four ";
      case 5:
        return "Five ";
      case 6:
        return "Six ";
      case 7:
        return "Seven ";
      case 8:
        return "Eight ";
      case 9:
        return "Nine ";
      default:
        return "Zero ";
    }
  }

  public static int countOfDigits(int number) {
    if(number < 10) {
      return 1;
    }
    int count = 0;
    while(number > 0) {
      count += 1;
      number /= 10;
    }
    return count;
  }

  public static int reversedNumber(int number) {
    int reversedNumber = 0;
    while(number > 0) {
      int digit = number % 10;
      reversedNumber = (reversedNumber * 10) + digit;
      number /= 10;
    }
    return reversedNumber;
  }

  public static void main(String[] args) {
    System.out.print("Enter the number: ");
    int number = scanner.nextInt();
    convertNumberToWords(number);
    scanner.close();
  }
}
