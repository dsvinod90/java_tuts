// How to find out a Leap Year if:
// Year is evenly divisible by 4 and 100 and 400
// Year is evenly divisible by 4 and not by 100
// Return false if input(int year) is < 1 or > 9999

public class LeapYearCalculator {
  public static boolean isLeapYear(int year) {
    if(year < 1 || year > 9999) {
      return false;
    } else if((year % 4 == 0) && (year % 100 != 0)) {
      return true;
    } else return (year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0);
  }

  public static void main(String[] args) {
    System.out.println("Year -1600 is a Leap Year: " + isLeapYear(-1_600));
    System.out.println("Year 1600 is a Leap Year: " + isLeapYear(1_600));
    System.out.println("Year 2017 is a Leap Year: " + isLeapYear(2_017));
    System.out.println("Year 2000 is a Leap Year: " + isLeapYear(2_000));
    System.out.println("Year 5640 is a Leap Year: " + isLeapYear(5_640));
    System.out.println("Year 5600 is a Leap Year: " + isLeapYear(5_600));
    System.out.println("Year 9987 is a Leap Year: " + isLeapYear(9_987));
  }
}
