## Classes & Constructors

A **class** can be seen as a blueprint that makes an object.

An **object** is an instance of class. It is characterised by state and behavior.

*Example:*

Let's assume that we have a class called Car. We now create an instance of this class (object) called "tesla".
This object called "tesla" will have:
*   State - color, number of wheels, no of seats, model, etc.
*   Behavior - go forward, go reverse, apply brakes, accelerate, decelerate etc.

In Java, we define a class like this:
```java
public class Car {
  // code here
}
```

The access-modifier used for this class is `public`. This means that it can be accessed from other classes. We will
discuss more about access-modifiers later.

A class can have variables called **fields**. It is usually good practice defining the fields as `private`. By doing so we
make sure that the fields are only available to be used within the scope of the class.

*For example:*
```java
public class Car {
  private String color;
  private int noOfWheels;
  private String model;
  private int noOfSeats;
  
  // Setter for color
  public void setColor(String color) {
    this.color = color;  
  }
  
  // Getter for color
  public String getColor() {
    return color;
  }
  
  // Setter for noOfWheels
  public void setNoOfWheels(int noOfWheels) {
    this.noOfWheels = noOfWheels;
  }

  // Getter for noOfWheels
  public int getNoOfWheels() {
    return noOfWheels;
  }
  
  public void goForward() {
    System.out.println("Going forward!");
  }
  
  public void accelerate() {
    System.out.println("Accelerating!");
  }
}
```

We use the setter methods to set the value of a private field and getter to fetch the value of the private fields.

We can access these public methods defined in the class by instantiating the class i.e. by creating objects of the class.
This is how we will call the methods defined above from our main class:
```java
public class Main {
  public static void main(String[] args) {
    Car tesla = new Car(); // Object named "tesla" created.
    // Setting values for the fields of Car class
    tesla.setColor = "black";
    tesla.setNoOfWheels = "4";
    // Getting values of the class fields
    System.out.println(tesla.getColor());
    System.out.println(tesla.getNoOfWheels());
    // Accessing method using the object "tesla"
    tesla.goForward();
    tesla.accelerate();
  }
}
```

A **constructor** is used to initialize objects. It is called when an object is created.
In the above example we initialized an object by executing:
```java
Car tesla = new Car();
```
Here we are calling an empty constructor defined in the class `Car`. We don't have to explicitly define an empty
constructor in a class. It is taken by default when an object is initialized.
Let's take a look at defining constructors for our `Car` class:
```java
public class Car {
  private String color;
  private int noOfWheels;
  private String model;
  private int noOfSeats;
  
  // Defining a constructor with no fields
  public Car() {
    System.out.println("Empty constructor called");
  }
  
  // Defining a constructor with all fields
  public Car(String color, int noOfWheels, String model, int noOfSeats) {
    this.color = color;
    this.noOfWheels = noOfWheels;
    this.model = model;
    this.noOfSeats = noOfSeats;
  }
  // Calling a constructor from another constructor
  public Car(String color, String model) {
    this(color, 4, model, 5); // Should be the first line
  }
}
public class Main {
  public static void main(String[] args) {
    Car ford = new Car(); // Empty constructor called
    Car tesla = new Car("black", 4, "Model X", "4"); // Constructor called that accepts all fields 
    Car honda = new Car("white", "Civic"); // Constructor called that accepts just two fields
  }
}
```

In the example above, we define three constructors, one without any arguments, one with all the arguments and one with just a few where
we call another constructor inside one.
*   The object `ford` calls the empty constructor.
*   The object `tesla` calls the constructor which accepts four arguments. In this constructor, we assign the value of the
    arguments to the fields. We use the keyword `this` to refer to the field value as opposed to the argument name. This keyword
    is used when the argument name is the same as the field name.
*   The object `honda` calls the constructor which accepts two arguments. In this constructor, we call another constructor.
    When we call one constructor from another we make use of the keyword `this`. In this context, the keyword `this` is used
    call a previously defined constructor passing the arguments we provide.