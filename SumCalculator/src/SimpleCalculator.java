public class SimpleCalculator {
  private double firstNumber;
  private double secondNumber;
  public double thirdNumber;

  public double getFirstNumber() {
    return firstNumber;
  }

  public void setFirstNumber(double firstNumber) {
    this.firstNumber = firstNumber;
  }

  public double getSecondNumber() {
    return secondNumber;
  }

  public double getThirdNumber() {
    return thirdNumber;
  }

  public void setSecondNumber(double secondNumber) {
    this.secondNumber = secondNumber;
  }

  public double getAdditionalResult() {
    return(firstNumber + secondNumber);
  }

  public double getSubtractionResult() {
    return(firstNumber - secondNumber);
  }

  public double getMultiplicationResult() {
    return(firstNumber * secondNumber);
  }

  public double getDivisionResult() {
    return(firstNumber / secondNumber);
  }
}
