## Parsing A Value From String

### Parsing String to Integer
Let's assume that we have a string "2018", and we want to convert it to an integer value.

**Syntax:**
```java
String numberStringValue = "2021";
int numberIntegerValue = Integer.parseInt(numberStringValue);
```
Here, we use the `Integer` wrapper class and make use of it's class method `parseInt` to convert the string input to an
integer type.

### Parsing String to Double
Let's assume that we have a string "2020.895", and we want to convert it to an integer value.

**Syntax:**
```java
String numberStringValue = "2021.874";
double numberDoubleValue = Double.parseDouble(numberStringValue);
```
Here, we use the `Double` wrapper class and make use of it's class method `parseDouble` to convert the string input to an
integer type.
