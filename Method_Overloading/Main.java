package Method_Overloading;

public class Main {
     
    public static void main(String[] args) {
        System.out.println("Creating an object an calling overloaded methods");
        HelperService hs = new HelperService();
        System.out.println(hs.formatNumber(500));//parameter type int
        System.out.println(hs.formatNumber(89.9934));//parameter type double
        System.out.println(hs.formatNumber("550"));//parameter type String
    }
}
