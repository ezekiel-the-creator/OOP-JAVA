A java anonymous class is a nested class that doest have a name.
It is defined inside another class.

It's syntax is:

```java
class outerClass {
    //defining anonymous class
    Type object = new Type(ParameterList) {
        //body of the anonymous class
    };
}
```
Here, **Type** can be
1. a superclass that an anonymous class extends
2. an interface that the anonymous class implements

Anonymous classes are defined inside an expression and therefore they must end with a semicolon to indicate that they are expresions.

**Advantages of Anonumous Classes**
* Objects are created whenever they are required, ofr example when we need to override a method.
* It helps to keep code concise.