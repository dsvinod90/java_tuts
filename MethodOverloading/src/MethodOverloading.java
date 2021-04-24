public class MethodOverloading {
  public static int sumOfNumbers(int a, int b) {
    System.out.println("Printing from sumOfNumbers for int and int");
    return a + b;
  }
  public static int sumOfNumbers(int a, int b, int c) {
    System.out.println("Printing from sumOfNumbers for int, int and int");
    return a + b + c;
  }
  public static double sumOfNumbers(int a, double b) {
    System.out.println("Printing from sumOfNumbers for int and double");
    System.out.println("The first argument is of type " + ((Object)a).getClass().getSimpleName());
    System.out.println("The second argument is of type " + ((Object)b).getClass().getSimpleName());
    return a + b;
  }
  public static long sumOfNumbers(int a, long b) {
    System.out.println("Printing from sumOfNumbers for int and long");
    System.out.println("The first argument is of type " + ((Object)a).getClass().getSimpleName());
    System.out.println("The second argument is of type " + ((Object)b).getClass().getSimpleName());
    return a + b;
  }

  // Examples with Type Promotion

  public void sum(int a, int b) {
    System.out.println("The first argument is of type " + ((Object)a).getClass().getSimpleName());
    System.out.println("The second argument is of type " + ((Object)b).getClass().getSimpleName());
    System.out.println("Sum of numbers = " + (a+b));
    System.out.println();
  }
  public void sum(int a, long b) {
    System.out.println("The first argument is of type " + ((Object)a).getClass().getSimpleName());
    System.out.println("The second argument is of type " + ((Object)b).getClass().getSimpleName());
    System.out.println("Sum of numbers = " + (a+b));
    System.out.println();
  }
  public void sum(long a, long b) {
    System.out.println("The first argument is of type " + ((Object)a).getClass().getSimpleName());
    System.out.println("The second argument is of type " + ((Object)b).getClass().getSimpleName());
    System.out.println("Sum of numbers = " + (a+b));
    System.out.println();
  }

  public static void main(String[] args) {
    System.out.println("Sum = " + sumOfNumbers(5, 10));
    System.out.println("===============================================");
    System.out.println("Sum = " + sumOfNumbers(5, 10, 15));
    System.out.println("===============================================");
    System.out.println("Sum = " + sumOfNumbers(3, 5.9));
    System.out.println("===============================================");
    System.out.println("Sum = " + sumOfNumbers(5, 2_000));
    System.out.println("===============================================");
    System.out.println("Sum = " + sumOfNumbers(5, (Long.MAX_VALUE-2_000)));
    System.out.println("===============================================");
    System.out.println("Method Overloading with Type Promotion");
    System.out.println();
    MethodOverloading obj = new MethodOverloading();
    obj.sum(20, 20);
    obj.sum(4_500, (Long.MAX_VALUE-10_000));
    obj.sum((Long.MAX_VALUE - 4_500), (Long.MAX_VALUE-10_000));

  }
}
