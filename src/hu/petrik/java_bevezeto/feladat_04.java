package hu.petrik.java_bevezeto;

import java.util.Scanner;

public class feladat_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("kérem adja meg a járomszög 'a' oldalát: ");
        double a = sc.nextDouble();
        System.out.print("kérem adja meg a járomszög 'b' oldalát: ");
        double b = sc.nextDouble();
        System.out.print("kérem adja meg a járomszög 'c' oldalát: ");
        double c = sc.nextDouble();
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double kerulet = a+b+c;
            System.out.printf("a háromszög kerülete: %f",kerulet);
        } else {
            System.out.println("hibás adatokat adott meg");
        }
    }
}
