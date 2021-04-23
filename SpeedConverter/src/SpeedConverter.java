public class SpeedConverter {
  public static long toMilesPerHour(double kilometersPerHour) {
    if(kilometersPerHour < 0) {
      return -1;
    }

//     Math.round returns the value of the argument rounded to the nearest integer value.
//     If argument is NaN(Double.NaN), output = 0
//     If argument is +ve infinity(Double.POSITIVE_INFINITY), output = Long.MIN_VALUE
//     If argument is -ve infinity(Double.NEGATIVE_INFINITY), output = Long.MAX_VALUE
    return Math.round(kilometersPerHour/1.609);
  }

  public static void printConversion(double kilometersPerHour) {
    long milesPerHour = toMilesPerHour(kilometersPerHour);
    if(milesPerHour < 0) {
      System.out.println("Invalid value.\n" +
          "  Input in KMPH: " + kilometersPerHour + "\n" +
          "  Output in MPH: " + milesPerHour);
    } else {
      System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
  }

  public static void main(String[] args) {
    printConversion(1.5);
    printConversion(10.25);
    printConversion(-5.6);
    printConversion(25.42);
    printConversion(75.114);
  }
}
