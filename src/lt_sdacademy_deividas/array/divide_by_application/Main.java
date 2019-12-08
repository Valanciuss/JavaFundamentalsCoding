package lt_sdacademy_deividas.array.divide_by_application;

import java.security.PublicKey;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner ivestasSkaicius = new Scanner(System.in);
        int num1;
        int num2;
        String veikmas = "/";

        double result;

        boolean skaiciuoti = true;
        while (skaiciuoti) {
            System.out.println("Iveskite pirmaji skaiciu: ");
            num1 = ivestasSkaicius.nextInt();
            System.out.println("Iveskite antraji skaiciu: ");
            num2 = ivestasSkaicius.nextInt();

//            System.out.println("Ar norite testi toliau? Taip : Ne ");
//            String naudotojoAtsakymas = ivestasSkaicius.nextLine();
//

            if (num1 == 0 || num2 == 0) {
                skaiciuoti = false;
                System.out.println("Balius baigtas ");
                break;

            }

            result = (double) num1 /  (double) num2;
            System.out.println(result);

            DecimalFormat suapvalinta = new DecimalFormat("#0.0000");
            System.out.println(suapvalinta.format(result));

        }
    }
}
