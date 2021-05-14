## Loops(for, while and do-while)
Loops are used to execute a set of instructions repeatedly when some condition is true.
There are three types of loops:
*   `for` loop
*   `while` loop
*   `do-while` loop

### For Loop:
#### What is it?
The for loop is a control-flow statement that iterates part of the program multiple times.
#### When to use?
It is recommended to use the `for` loop if the number of iterations is fixed.
#### Syntax for finite loop
```java
for(init;condition;incr/decr){  
// code to be executed
}
```
#### Syntax for infinite loop
```java
for(;;) {
// code to be executed
}
```
#### Example
```java
for(int i = 0; i < 10; i++) {
  System.out.println(i);
}
```

### While Loop:
#### What is it?
Like the `for` loop, the `while` loop is also a control-flow statement that executes parts of a program multiple times.
#### When to use?
It is recommended to use the `while` loop if the number of iterations are not fixed.
#### Syntax for finite loop
```java
while(condition){  
//code to be executed 
}
```
#### Syntax for infinite loop
```java
while(true){  
//code to be executed  
}
```
#### Example
```java
int i=1;  
while(i<=10){  
  System.out.println(i);  
  i++;  
}
```

### Do-While Loop
#### What is it?
It is a control-flow statement that executes a part of the program at least once and all subsequent iterations depend on
given boolean condition.
#### When to use?
It is recommended to run the `do-while` loop if the number of iterations are not fixed, and the loop has to be executed
at least once.
#### Syntax for finite loop
```java
do{  
//code to be executed  
}while(condition); 
```
#### Syntax for infinite loop
```java
do{  
//code to be executed  
}while(true); 
```
#### Example
```java
int i=1;  
do{
  System.out.println(i);
  i++;  
}while(i<=10);
```