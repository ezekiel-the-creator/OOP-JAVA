package Java_enums;

enum Size{
    SMALL, MEDIUM, LARGE, EXTRALARGE;
  
    public String getSize() {
  
      // this will refer to the object SMALL
      switch(this) {
        case SMALL:
          return "small";
  
        case MEDIUM:
          return "medium";
  
        case LARGE:
          return "large";
  
        case EXTRALARGE:
          return "extra large";
  
        default:
          return null;
        }
     }
  
    public static void main(String[] args) {
  
      // call getSize()
      // using the object SMALL
      System.out.println("The size of the pizza is " + Size.SMALL.getSize());
    }
  }