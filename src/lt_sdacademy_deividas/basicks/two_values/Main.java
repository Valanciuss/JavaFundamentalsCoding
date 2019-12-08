package lt_sdacademy_deividas.basicks.two_values;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

//3. Enter two values of type int. Display their division
//casted to the double type and rounded to the third decimal point.

        int pirmas = 123;
        int antras = 3;
        String norimasAtliktiVeiksmas = "/";
        DecimalFormat trisSkaiciiaPoKableli = new DecimalFormat("#0.000");

        double atsakymas;
        atsakymas = (pirmas / antras);
        System.out.println("paprastas: " + atsakymas);
        System.out.println(trisSkaiciiaPoKableli.format("Suapvalintas: " + atsakymas));

        //Neiseina atlikti veiksmo kaip kad skaiciuotuve, kodel?
        //        atsakymas = getResult(norimasAtliktiVeiksmas, pirmas,antras);
        //        System.out.println(atsakymas);

    }


}
