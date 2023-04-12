class CPU {
    double price;

    class Processor{
        double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    protected class RAM {
        double memory;
        String manufacturer;

        double getClockspeed() {
            return 3.2;
        }
    }
}