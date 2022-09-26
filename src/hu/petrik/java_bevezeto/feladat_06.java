package hu.petrik.java_bevezeto;

import java.util.Scanner;

public class feladat_06 {
	public static void main(String[] args) {
//		Írjon programot, ami értékel egy dolgozatot az alábbiak alapján:
//		Pontszám Értékelés:
//		• 0-42 elégtelen
//		• 43-57 elégséges
//		• 58-72 közepes
//		• 73-87 jó
//		• 88-100 jeles
		Scanner sc = new Scanner(System.in);
		System.out.print("adja meg a dolgozat pontszámát: ");
		int pontszam = sc.nextInt();
		if (pontszam < 43) {
			System.out.println("elégtelen");
		} else if (pontszam < 58) {
			System.out.println("elégséges");
		} else if (pontszam < 73) {
			System.out.println("közepes");
		} else if (pontszam < 88) {
			System.out.println("jó");
		} else {
			System.out.println("jeles");
		}
	}
}

