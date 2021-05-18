interface Message {
  String greet();
}

public class Main {
  // Anonymous Inner Class as argument
  public void displayMessage(Message m) {
    System.out.println("From anonymous inner class: " + m.greet());
  }
  public static void main(String[] args) {
    OuterClass outer = new OuterClass();
    // Accessing inner class
    System.out.println("Inner class: " + outer.outerSum());
    // Accessing method-local inner class
    outer.myMethod();
    // Passing an anonymous inner class as an argument
    Main obj = new Main();
    obj.displayMessage(new Message() {
      @Override
      public String greet() {
       return "Hello";
      }
    });
  }
}
