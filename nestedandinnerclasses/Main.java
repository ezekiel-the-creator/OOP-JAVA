package nestedandinnerclasses;

public class Main {
    public static void main(String... args){
        CPU cpu = new CPU();
        CPU.Processor p1 = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();

        System.out.println("Process");
    }
}