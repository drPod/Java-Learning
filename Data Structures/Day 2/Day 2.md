## Reference Variable
```java
Circle cir = new Circle(3.0);
```
- Circle: class name
- cir: reference variable which will hold the address of a circle object
- new Circle(3.0): is the object of class Circle location at the address contained in the reference variable cir
- Left-hand side goes to the stack and right-hand side goes to the heap
- Primitives are created at compile time while Objects are created at runtime

- Contiguous memory: consecutive blocks of memory (arrays)
```java
double[] myList; // only myList in the stack
myList = new double[10]; // in the heap
```