public class ParseString {
  public static void main(String[] args) {
    String numberAsString = "2021";
    int numberAsInt = Integer.parseInt(numberAsString);
    System.out.println("Parsing String to Integer: ");
    System.out.println("String value = " + numberAsString);
    System.out.println("Adding one to string value = " + (numberAsString + 1));
    System.out.println("Integer value = " + numberAsInt);
    System.out.println("Adding one to integer value = " + (numberAsInt + 1));

    System.out.println();

    System.out.println("Parsing String to Double: ");
    String doubleNumberAsString = "2021.8796";
    double numberAsDouble = Double.parseDouble(doubleNumberAsString);
    System.out.println("String value = " + doubleNumberAsString);
    System.out.println("Adding one to string value = " + (doubleNumberAsString + 1.87));
    System.out.println("Double value = " + numberAsDouble);
    System.out.println("Adding one to double value = " + (numberAsDouble + 1.87));
  }
}
