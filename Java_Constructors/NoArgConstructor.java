package Java_Constructors;

public class NoArgConstructor {
    int a;

    private NoArgConstructor(){
        int a = 4;
    }

    public static void main(String... args){
        NoArgConstructor obj = new NoArgConstructor();
        System.out.println("Value of a is " + obj.a);
    }
}

//if you want to create objects outside the class, use a public constructor