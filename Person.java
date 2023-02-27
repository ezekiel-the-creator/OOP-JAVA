public class Person {
    
    //Declaring private member variables
    privat String name;
    private int age;
    private String address;

    //Defining public getter method for 'name' variable
    public String getName() {
        return name;
    }

    //setter method for 'age' variable
    public void setAge(int age) {
        this.age = age;
    }
    
    //getter method for 'address variable'
    public String getAdress() {
        return address;
    }

    //setter method for 'address' variable

    public void setAddress(String address) {
        this.address = address;
    }

    //A public method to print the details of the person object
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Adress: " address)
    }
}