package Java_Nested_Static_Class;

public class Animal {
    // inner class
   class Reptile {
    public void displayInfo() {
      System.out.println("I am a reptile.");
    }
 }

    // static class
   static class Mammal {
    public void displayInfo() {
      System.out.println("I am a mammal.");
    }
 }
}