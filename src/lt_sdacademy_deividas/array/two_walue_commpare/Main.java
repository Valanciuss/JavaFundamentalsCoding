package lt_sdacademy_deividas.array.two_walue_commpare;

public class Main {
    public static void main(String[] args) {

        int skaicius1 = 10;
        int skaicius2 = 24;
        int salyga = 24;

        if (skaicius1 < salyga)
        {
            System.out.println("Skaicius " + skaicius1 + " yra mazesnis uz skaiciu " + salyga);
        }
        else if (skaicius1 > salyga) {
            System.out.println("Skaicius " + skaicius1 + " yra didesnis uz skaiciu " + salyga);
        }
        else if (skaicius1 == salyga) {
            System.out.println("Skaicius " + skaicius1 + " yra lygus skaiciui " + salyga);
        }

        if (skaicius2 < salyga)
        {
            System.out.println("Skaicius " + skaicius2 + " yra mazesnis uz skaiciu " + salyga);
        }
        else if (skaicius2 > salyga) {
            System.out.println("Skaicius " + skaicius2 + " yra didesnis uz skaiciu " + salyga);
        }
        else if (skaicius2 == salyga) {
            System.out.println("Skaicius " + skaicius2 + " yra lygus skaiciui " + salyga);
        }


    }
}
