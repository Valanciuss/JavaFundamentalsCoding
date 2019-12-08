package lt_sdacademy_deividas.array.greater_equal_or_lower;

public class Main {
    public static void main (String[]args){

        double ivestasSkaicius = 10;
        double salyga = 30;

        if (ivestasSkaicius < salyga){
            System.out.println("Ivestas skaicius mazesnis uz " +salyga);
        }
        else if (ivestasSkaicius > salyga){
            System.out.println("Ivestas skaicius didesnis uz " +salyga);
        }
        else if (ivestasSkaicius == salyga) {
            System.out.println("Ivestas skaicius lygus skaiciui - " +salyga);
        }


    }


}
