# **OOP-JAVA**
##### Object-Oriented programming is a programming pradigm that focuses on the use of objects to represent and manipulate data. Java is a popular programming language that supports OOP concepts.

## **OOP concepts in java**

### ***Class***

*A **blueprint** for creating objects. It defines the attributes and behaviour that an object of that class will have. They are used to creating objects*

We can create a class in java using the `class` keyword. For example, 

 ```java
 class ClassName{
  //fields
  //methods
}
```
In the above example:
* fields are used to store data(variables) that reperesent states
* methods are used to perform operations.They represent behavior of an object.

### ***Object***

*An object is an **instance** of a class. It is a real world entity that has state and behavior. For example a `motorbike` is an object. It has*
* States: idle, first gear, second gear, etc
* Behaviors: braking, accelerating and so on
Below is the syntax to create an object of a class.
```java
className objectname = new className();
```
We have used the `new` keyword followed by the constructor of the class to create an object. Constructors are similar to methods and have the same name as the class.

We can access the members of a class by using the name of the object along with `.` operator.

Consider the followint example.

```java
class Motorbike {
 
 int gear = 4;
 
 public void brake(int d){
  System.out.println("Decelarating at" + d + " metres per second squared")
 }
}

//create an object
Motorbike mountainBike = new MotorBike();

//access members of the class
mountainBike.gear;
mountainBike.brake();
}
```

### ***Inheritance***

*A mechanism in which a new class is **derived from** an existing class.The new class inherits all the attribute s and behaviors of the existing class and can also add new attributes and behaviors.*

### ***Interface***

*A collection of **abstract methods** that define a **set of actions** that a **class can perform**. It provides a way to achieve abstraction and polymorphism in java.The are used to define the behaviour of classes without specifying how the behavior is implimented*

### ***Encapsulation***

*A practice of **hiding** the **implementation details** of an object and providing a public interface for accessing the objects attributes and behaviors. It is achieved by using access modifiers like private, protected, default, public*

### ***Polymorphism***

*Ability of an object to take **many forms**. It is achieved through **method overriding** and **method overloading**. Method overriding allows a subclass to provide a specific implementation of a method that is already defined in the superclass, while method overloading allows a class to define multiple methods with the same name but different parameters.*
