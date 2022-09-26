package hu.petrik.java_bevezeto;

import java.util.Scanner;

public class feladat_12 {
	public static void main(String[] args) {
//		Készítsen programot, amely bekér egy összeget (minimum 1, maximum 1000 Ft), majd kiírja, hogy azt hogyan lehet a
//		lehető legkevesebb pénzérméből összeállítani.
		Scanner sc = new Scanner(System.in);
		System.out.print("adjon meg egy összeget (1-1000 Ft): ");
		int osszeg = sc.nextInt();
		if (osszeg >= 1 && osszeg <= 1000) {
			int[] ermek = {200, 100, 50, 20, 10, 5};
			for (int i = 0; i < ermek.length; i++) {
				System.out.printf("%d Ft-osok: %d\n", ermek[i], (int) Math.floor(osszeg / ermek[i]));
				osszeg = osszeg % ermek[i];
			}
			System.out.printf("maradék: %d Ft", osszeg);
		} else {
			System.out.println("az összeg nincs a meghatározott skálán!");
		}
	}
}
