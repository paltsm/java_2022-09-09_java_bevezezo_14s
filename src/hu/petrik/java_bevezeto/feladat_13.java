package hu.petrik.java_bevezeto;

import java.util.Scanner;

public class feladat_13 {
	public static void main(String[] args) {
//		Készítsen játékprogramot, amely gondol egy számot 1 és 100 között. A felhasználó addig találgathat, amíg nem
//		találja el a keresett számot. A számítógép minden rossz tipp után írja ki, hogy a gondolt szám nagyobb vagy kisebb.
		Scanner sc = new Scanner(System.in);
		int random = (int) ((Math.random() * 100) + 1);
		System.out.print(random);
		System.out.print("gondoltam egy számra 1 és 100 között, találja ki: ");
		int tipp = sc.nextInt();
		while (tipp != random) {
			if (tipp > random) {
				System.out.print("KISEBB számra gondoltam: ");
			} else if (tipp < random) {
				System.out.print("NAGYOBB számra gondoltam: ");
			}
			tipp = sc.nextInt();
		}
		System.out.printf("NYERT!! a szám amire gondoltam: %d", random);
	}
}
