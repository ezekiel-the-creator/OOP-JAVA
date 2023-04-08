package Classes_and_objects;

public class Lamp {
    boolean isOn;

    public void turnOn(){
        isOn = true;
        System.out.println("Light on?" + isOn);
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Light on?" + isOn);
    }
}
