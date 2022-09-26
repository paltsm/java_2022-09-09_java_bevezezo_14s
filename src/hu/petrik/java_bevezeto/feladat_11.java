package hu.petrik.java_bevezeto;

import java.util.Scanner;

public class feladat_11 {
	public static void main(String[] args) {
//		Kérjen be egy N pozitív egész számot, majd írja ki az N-nél nem nagyobb pozitív páratlan számok összegét!
		Scanner sc = new Scanner(System.in);
		System.out.print("adjon meg egy pozitív egész számot: ");
		int szam = sc.nextInt();
		if (szam > 0) {
			int osszeg = 0;
			for (int i = 1; i <= szam; i += 2) {
				osszeg += i;
			}
			System.out.printf("összeg: %d", osszeg);
		} else {
			System.out.println("nem pozitív egész számot adott meg!");
		}
	}
}
