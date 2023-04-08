package Method_overloading;

public class Main {
     
    public static void main(String[] args) {
        System.out.println("Creating an object an calling overloaded methods");
        HelperService hs = new HelperService();
        System.out.println(hs.formatNumber(500));
        System.out.println(hs.formatNumber(89.9934));
        System.out.println(hs.formatNumber("550"));
    }
}
