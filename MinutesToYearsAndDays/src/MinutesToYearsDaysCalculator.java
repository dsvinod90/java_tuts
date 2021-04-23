// void #printYearsAndDays with param of type long named minutes
// If param < 0 then print "Invalid Value"
// If param is valid then print message in the format XX min = YY year(s) and ZZ day(s)
// Conversions:
// 1 hour = 60 minutes
// 1 day = 24 hours
// 1 year = 365 days

public class MinutesToYearsDaysCalculator {
  public static void printYearsAndDays(long minutes) {
    if(minutes < 0) {
      System.out.println("Invalid Value");
      return;
    }
    long hours = minutes / 60;
    long days = hours / 24;
    long years = days / 365;
    long remainingDays = days % 365;
    System.out.println(minutes + " min = " + years + " year(s) and " + remainingDays + " day(s)");
  }

  public static void main(String[] args) {
    printYearsAndDays(525_600);
    printYearsAndDays(1_051_200);
    printYearsAndDays(561_600);
  }
}
