package CaglaSonmez;

import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz Gün: ");
        int day = input.nextInt();

        System.out.println("Doğduğunuz Ay: ");
        int month = input.nextInt();

        String horoscope = "";

        if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
            horoscope = "Kova Burcu";
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            horoscope = "Balık Burcu";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            horoscope = "Koç Burcu";
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            horoscope = "Boğa Burcu";
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
            horoscope = "İkizler Burcu";
        } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
            horoscope = "Yengeç Burcu";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            horoscope = "Aslan Burcu";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            horoscope = "Başak Burcu";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            horoscope = "Terazi Burcu";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            horoscope = "Akrep Burcu";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            horoscope = "Yay Burcu";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
            horoscope = "Oğlak Burcu";
        } else {
            System.out.println("Geçersiz tarih girişi!");
            System.exit(0);
        }

        System.out.println("Burcunuz: " + horoscope);
    }
}
