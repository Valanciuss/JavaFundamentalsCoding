package lt_sdacademy_deividas.basicks.suapvalinti_skaiciu;

import java.text.DecimalFormat;

public class SuapvalintiMain {
    public static void main (String[] args) {

        double skaicius = 31.6596165;
        DecimalFormat suapvalintaIkiDviejuPoKalbelio = new DecimalFormat("#0.00");

        DecimalFormat suapvalintaIkiKeturiuPoKablelio = new DecimalFormat("#0.0000");

        System.out.println("Ivestas skaicius: " + skaicius);
        System.out.println("Du skaiciai po kalblelio: " + suapvalintaIkiDviejuPoKalbelio.format(skaicius));
        System.out.println("Keturi skaiciai po kalblelio: " + suapvalintaIkiKeturiuPoKablelio.format(skaicius));

    }
}
//    double no=12.786;
//    DecimalFormat dec = new DecimalFormat("#0.00");
//System.out.println(dec.format(no));