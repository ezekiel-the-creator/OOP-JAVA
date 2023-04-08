package Java_Constructors;

public class ParameterizedConstructor {
    String languages;

    ParameterizedConstructor(String language){
        languages = language;
    }

    public static void main(String... args){
        ParameterizedConstructor obj1 = new ParameterizedConstructor("Rust");
        ParameterizedConstructor obj2 = new ParameterizedConstructor("java");
    }
}
