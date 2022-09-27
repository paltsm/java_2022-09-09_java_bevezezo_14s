package hu.petrik.java_bevezeto;

import java.util.Scanner;

public class feladat_16 {
	public static void main(String[] args) {
//		Hozzon létre egy öt elemű, egész számokból álló tömböt, majd töltse fel a felhasználótól bekért számokkal.
//		▪ Írja ki a tömb elemeit a megadás sorrendjében.
//		▪ Írja ki a tömb elemeit fordított sorrendben.
//		▪ Írja ki a tömb minden második elemét a képernyőre.
//		▪ Kérjen be a felhasználótól egy számot 1 és 5 között, majd írja ki a tömb megadott elemét a képernyőre.
		Scanner sc = new Scanner(System.in);
		int[] tomb2 = new int[5];
		for (int i = 0; i < tomb2.length; i++) {
			System.out.print("adjon meg egy számot: ");
			int szam = sc.nextInt();
			tomb2[i] = szam;
		}
		for (int szam : tomb2) {
			System.out.print(szam + " ");
		}
		System.out.println();
		for (int i = tomb2.length - 1; i >= 0; i--) {
			System.out.print(tomb2[i] + " ");
		}
		System.out.println();
		for (int i = 1; i < tomb2.length; i += 2) {
			System.out.print(tomb2[i] + " ");
		}
		System.out.println();
		System.out.print("adjon meg egy számot 1 és 5 között: ");
		int ker = sc.nextInt();
		if (ker > 0 && ker < 5) {
			System.out.println(tomb2[ker - 1]);
		} else{
			System.out.println("a szám nincs a kért tartományban");
		}
	}
}
