package hu.petrik.java_bevezeto;

import java.util.Scanner;

public class feladat_03 {
	public static void main(String[] args) {
//		Kérjen be a felhasználótól egy pozitív valós számot, majd írja ki az alábbi szöveget a képernyőre, a * jel helyére behelyettesítve a
//		megfelelő értékeket:
//		A megadott szám a * és a * egész számok között van, és ezek közül a * számhoz van közelebb.
//		A szám egész része: *
//		A szám törtrésze: *
		Scanner sc = new Scanner(System.in);
		System.out.print("adjon meg egy pozitív valós számot: ");
		double valos = Double.parseDouble(sc.nextLine().replace(",", "."));
		int le = (int) Math.floor(valos);
		int fel = (int) Math.ceil(valos);
		System.out.printf("A megadott szám a %d és a %d egész számok között van, és ezek közül a %d számhoz van közelebb.\n", le, fel, valos - le < fel - valos ? le : fel);
		System.out.printf("A szám egész része: %d\n", le);
		System.out.printf("A szám törtrésze: %f\n", valos - le);
	}
}
