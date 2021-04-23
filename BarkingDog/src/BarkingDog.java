// We have a dog in our house and we need to wake up if the dog is barking and the hour of the day is < 8 or hour of the day > 22.
// In all other cases we don't need to wake up
// If the hour of the day is < 0 or > 23 then we don't need to wake up.
public class BarkingDog {
  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
    if(hourOfDay < 0 || hourOfDay > 23) {
      return false;
    }
    return (barking && (hourOfDay < 8 || hourOfDay > 22));
  }

  public static void main(String[] args) {
    System.out.println(shouldWakeUp(true, 1));
    System.out.println(shouldWakeUp(false, 2));
    System.out.println(shouldWakeUp(true, 8));
    System.out.println(shouldWakeUp(true, -1));
  }
}
