public class OuterClass {
  private int outernum = 50;

  public int outerSum() {
    InnerClass inner = new InnerClass();
    return inner.sum();
  }
  // Inner class example
  private class InnerClass {
    private int innerNum = 80;
    public int sum() {
      return (innerNum + outernum);
    }
  }
  // Method-local inner class
  public void myMethod() {
    int num = 23;
    class MethodInnerDemo {
      public void displayOutput() {
        System.out.println("This is the method-local inner class " + num);
      }
    }
    MethodInnerDemo innerDemo = new MethodInnerDemo();
    innerDemo.displayOutput();
  }
}
