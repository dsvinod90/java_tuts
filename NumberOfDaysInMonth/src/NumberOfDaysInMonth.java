import java.util.Calendar;
import java.util.Scanner;

public class NumberOfDaysInMonth {
  public boolean isLeapYear(int year) {
    if(year < 1 || year > 9_999) {
      return false;
    }
    return (((year % 4 == 0) && (year % 100 !=0)) || year % 400 == 0);
  }
  public int getDaysInMonth(int month, int year) {
    if(month < 1 || month > 12 || year < 1 || year > 9_999) {
      return -1;
    }
    switch(month) {
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        return 31;
      case 2:
        if (isLeapYear(year)){
          return 29;
        } else {
          return 28;
        }
      default:
        return 30;
    }
  }
  public static String getMonth(int month) {
    switch(month) {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Invalid Month";
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a month: ");
    int month = scanner.nextInt();
    System.out.println("Enter a year: ");
    int year = scanner.nextInt();
    NumberOfDaysInMonth obj = new NumberOfDaysInMonth();
    Calendar currentDate = Calendar.getInstance();
    int currentYear = currentDate.get(Calendar.YEAR);
    int numberOfDays = obj.getDaysInMonth(month, year);
    if(numberOfDays == -1){
      System.out.println("Invalid value provided for month/year. Please try again with valid values.");
    } else if(year < currentYear) {
      System.out.printf("There were %d days in %s, %d%n", numberOfDays, getMonth(month), year);
    } else if(year == currentYear) {
      System.out.printf("There are %d days in %s, %d%n", numberOfDays, getMonth(month), year);
    } else {
      System.out.printf("There will be %d days in %s, %d%n", numberOfDays, getMonth(month), year);
    }
    scanner.close();
  }
}
