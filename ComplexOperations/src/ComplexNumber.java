public class ComplexNumber {
  private double real;
  private double imaginary;

  public ComplexNumber(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public double getReal() {
    return Double.parseDouble(String.format("%.2f", real));
  }

  public double getImaginary() {
    return Double.parseDouble(String.format("%.2f", imaginary));
  }

  public void add(double real, double imaginary) {
    this.real += real;
    this.imaginary += imaginary;
  }

  public void subtract(double real, double imaginary) {
    this.real -= real;
    this.imaginary -= imaginary;
  }
}
