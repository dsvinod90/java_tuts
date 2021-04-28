public class AreaCalculator {
  public static double area(double radius) {
    if(radius < 0) {
      return -1.0;
    }
    return Math.PI * Math.pow(radius, 2);
  }
  public static double area(double length, double breadth) {
    if(length < 0 || breadth < 0) {
      return -1.0;
    }
    return length * breadth;
  }

  public static void main(String[] args) {
    System.out.println("Area of circle with radius as 5 = " + area(5.0));
    System.out.println("Area of rectangle with length 5 and breadth 4 = " + area(5.0, 4.0));
    System.out.println("Area of circle with radius -1 = " + area(-1.0));
    System.out.println("Area of rectangle with length -1 and breadth 4 = " + area(-1.0, 4.0));
  }
}
