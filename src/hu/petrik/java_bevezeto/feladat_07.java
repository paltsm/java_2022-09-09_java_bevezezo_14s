package hu.petrik.java_bevezeto;

import java.util.Scanner;

public class feladat_07 {
	public static void main(String[] args) {
//		Készítsen programot, ami bekéri, hogy hányadik hónapot írunk, majd megadja, hogy melyik évszakban járunk.
		Scanner sc = new Scanner(System.in);
		System.out.print("adja meg hanyadik hónapot írunk: ");
		int honap = sc.nextInt();
		switch (honap) {
			case 1:
				System.out.println("január");
				break;
			case 2:
				System.out.println("február");
				break;
			case 3:
				System.out.println("március");
				break;
			case 4:
				System.out.println("április");
				break;
			case 5:
				System.out.println("május");
				break;
			case 6:
				System.out.println("június");
				break;
			case 7:
				System.out.println("július");
				break;
			case 8:
				System.out.println("augusztus");
				break;
			case 9:
				System.out.println("szeptember");
				break;
			case 10:
				System.out.println("október");
				break;
			case 11:
				System.out.println("november");
				break;
			case 12:
				System.out.println("december");
				break;
			default:
				System.out.println("az értéknek 1 és 12 között kell lennie");
		}
	}
}
