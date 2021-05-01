## Accept User Input
We make use of the class Scanner (text scanner) which can parse primitive types and string.

### Syntax
`System.in` is used to accept input from the console which is return to the program. We create an instance of `Scanner`
called `scanner` which stores the value of the input. The instance allows us to execute many methods on it as explained further in this
chapter.
```java
Scanner scanner = new Scanner(System.in);
```

#### String Input
We use the method `#nextLine()` to read a String input.
```java
String name = scanner.nextLine();
```

#### Integer Input
We use the method `#nextInt()` to read an Integer input.
```java
int number = scanner.nextInt();
```

#### Check if the provided input is a String
We use the method `#hasNext()` to check if there is any input token present for the input provided. It returns `true` if
it has another non-whitespace character. This method returns a boolean value

We use the method `#hasNextLine()` to check if there is another line of input for the Scanner object even if the line is
blank or not. This method returns a boolean value.
```java
boolean namePresent = scanner.hasNextLine();
OR
boolean namePresent = scanner.hasNext();
```

#### Check if the provided input is an Integer
We use the method `#hasNextInt()` to check if there is any integer input present for the Scanner object.
This method returns a boolean value.
```java
boolean numberPresent = scanner.hasNextInt();
```

*The syntax follows similarly for other primitive data types as well.*
