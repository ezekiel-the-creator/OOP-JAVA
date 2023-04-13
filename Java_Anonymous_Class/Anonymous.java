package Java_Anonymous_Class;

public class Anonymous {
    public void createClass() {
      Polygon p1 = new Polygon() {
        public void display(){
            System.out.println("Inside the anonymous class");
        }
        };
        p1.display();
    }
}
