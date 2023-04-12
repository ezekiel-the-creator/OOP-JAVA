package nestedandinnerclasses;

public class Main {
    public static void main(String... args){
        //Inner class
        CPU cpu = new CPU();
        CPU.Processor p1 = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();

        System.out.println("Processor Cache = " + p1.getCache());
        System.out.println("Ram Clock Speed = " + ram.getClockspeed());
    }
}