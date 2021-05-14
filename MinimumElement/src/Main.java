public class Main {
  public static void main(String[] args) {
    MinimumElement minElement = new MinimumElement();
    int countOfNumbers = minElement.readInteger();
    int min = minElement.findMin(minElement.readElements(countOfNumbers));
    System.out.println("The minimum number in the array is " + min);
  }
}
