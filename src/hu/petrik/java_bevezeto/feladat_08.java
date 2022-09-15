package hu.petrik.java_bevezeto;

import java.util.Scanner;

public class feladat_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("fej vagy írás? (0 - fej || 1 - írás)");
        int tipp = sc.nextInt();
        int gepDobas = (int)(Math.random() * 2);
        /*
        egész szám generálása 'min' és 'ma' között:
        (int)(Math.random() * (max-min+1))+min
         */
        System.out.printf("dobás eredménye %s", gepDobas==0 ? "fej" : "írás");
        /*
        háromlábú operátor:
        (logikai feltétel) ? érték ha igaz : érték ha hamis
         */
        //1:15:00 valami lemaradt
    }
}
