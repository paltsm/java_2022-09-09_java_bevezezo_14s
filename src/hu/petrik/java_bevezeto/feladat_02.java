package hu.petrik.java_bevezeto;

import java.util.Scanner;

public class feladat_02 {
	public static void main(String[] args) {
//		Készítsen programot, amely segíti a burkoló mesterek munkáját. A szükséges csempe mennyiségének a kiszámításához a
//		program kérje be a terület szélességét, valamint a magasságát méterben, majd számolja ki, hogy 20cm x 20cm méretű csempék
//		esetén hány darabra van szükség a munka elvégzéséhez (a plusz 10%-ot az illesztések miatt illik rászámolnunk).
		Scanner sc = new Scanner(System.in);
		System.out.print("adja meg a terület szélességét (m): ");
		double szelesseg = sc.nextDouble();
		System.out.print("adja meg a terület magasságát (m): ");
		double magassag = sc.nextDouble();
		int csempe = 20;
		double csempeDb = (szelesseg * 100 * magassag * 100) * 0.9 / (20 * 20);
		System.out.printf("a szükséges csempék száma: %.3f", csempeDb);
	}
}
