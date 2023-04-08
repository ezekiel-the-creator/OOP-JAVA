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
