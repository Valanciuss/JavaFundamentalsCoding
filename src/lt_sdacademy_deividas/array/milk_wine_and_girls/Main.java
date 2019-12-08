package lt_sdacademy_deividas.array.milk_wine_and_girls;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        double milkPrice = 2;
        double winePrice = 5;
        String atsakymas;
        int duotiPinigu;

        System.out.println("What you want to buy? Milk or Wine? ");
        atsakymas = userInput.next();

        if (atsakymas.equals("Milk")) {
            System.out.println("Milk price is: " + milkPrice);
            System.out.println("Drug Dealer: Please pay now ");

            System.out.println("Deividas: Oky, this is a mount of money that i will pay :  ");
            duotiPinigu = userInput.nextInt();
            System.out.println();
            if (duotiPinigu == milkPrice) {
                System.out.println("Thanks for shoping brooo... ");
            } else {
                System.out.println("Drug Dealer: The money mount not maches the price,wait a bit ");
            }

        } else if (atsakymas.equals("Wine")) {
            System.out.println("Wine price is: " + winePrice);
            System.out.println("Drug Dealer: Please pay now ");

            System.out.println("Deividas: Oky, this is a mount of money that i will pay : ");
            duotiPinigu = userInput.nextInt();
            System.out.println();
            if (duotiPinigu == winePrice) {
                System.out.println("Thanks for shoping brooo... ");
            } else {
                System.out.println("Drug Dealer: The money mount not maches the price, wait a bit ");
            }

        } else {
            System.out.println("Drug Dealer - Finger your self, we don't have that sh&% ");
        }

    }
}
