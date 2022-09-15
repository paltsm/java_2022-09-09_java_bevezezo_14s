package hu.petrik.java_bevezeto;

import java.util.Scanner;

public class feladat_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int osszeg = 0;
        int paros = 0;
        int paratltan = 0;
        System.out.println("kérem adjon meg egy számot: "); //nem kell while-ban mert ez csak kiiras
        while (osszeg <= 100) {
            int szam = sc.nextInt(); //ez nezi az inputot
            osszeg += szam;
            if (szam % 2 == 0) {
                paros++;
            } else {
                paratltan++;
            }
        }
        System.out.printf("páratlanok: %d\npárosak: %d",paratltan,paros);
    }
}
