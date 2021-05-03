import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Complex Number One: ");
    System.out.print("Enter value for real component: ");
    double real = scanner.nextDouble();
    System.out.print("Enter value for imaginary component: ");
    double imaginary = scanner.nextDouble();
    ComplexNumber number = new ComplexNumber(real, imaginary);
    String inputComplexNumber = "(" + number.getReal() + " + " + number.getImaginary() + "i)";
    System.out.println("Entered complex number: " + inputComplexNumber);
    System.out.println();

    System.out.println("Addition: ");
    System.out.print("Enter number to be added to real component: ");
    double addReal = scanner.nextDouble();
    System.out.print("Enter number to be added to imaginary component: ");
    double addImaginary = scanner.nextDouble();
    number.add(addReal, addImaginary);
    String addedComplexNumber = "(" + addReal + " + " + addImaginary + "i)";
    String sumComplexNumber = "(" + number.getReal() + " + " + number.getImaginary() + "i)";
    System.out.println("Sum of " + inputComplexNumber + " and " + addedComplexNumber + " = " + sumComplexNumber);
    System.out.println();

    System.out.println("Complex Number Two: ");
    System.out.print("Enter value for real component: ");
    double realTwo = scanner.nextDouble();
    System.out.print("Enter value for imaginary component: ");
    double imaginaryTwo = scanner.nextDouble();
    ComplexNumber numberTwo = new ComplexNumber(real, imaginary);
    String inputComplexNumberTwo = "(" + numberTwo.getReal() + " + " + numberTwo.getImaginary() + "i)";
    System.out.println("Entered complex number: " + inputComplexNumberTwo);
    System.out.println();

    System.out.println("Subtraction: ");
    System.out.print("Enter number to be added to real component: ");
    double subtractReal = scanner.nextDouble();
    System.out.print("Enter number to be added to imaginary component: ");
    double subtractImaginary = scanner.nextDouble();
    numberTwo.subtract(subtractReal, subtractImaginary);
    String subtractedComplexNumber = "(" + subtractReal + " + " + subtractImaginary + "i)";
    String differenceComplexNumber = "(" + numberTwo.getReal() + " + " + numberTwo.getImaginary() + "i)";
    System.out.println("Difference of " + inputComplexNumberTwo + " and " + subtractedComplexNumber + " = " + differenceComplexNumber);
    scanner.close();
  }
}
