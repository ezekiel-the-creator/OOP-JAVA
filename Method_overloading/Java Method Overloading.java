package Method_overloading;
//Method Overloading - two or more functions have the same name but different parameters(different number of parameters, different types of parameters, or both).
   
//Example code:

class HelperService {
    public String formatNumber (int value) {
        return String.format("%d", value);
    }
    
    public String formatNumber (double value){
        return String.format("%.3f", value);
    }
    
    public String formatNumber(String value){
        return String.format("%.2f", Double.parseDouble(value));
    }
}

