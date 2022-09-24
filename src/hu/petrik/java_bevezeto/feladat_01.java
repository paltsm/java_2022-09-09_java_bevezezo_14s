package hu.petrik.java_bevezeto;

import java.util.Scanner;

public class feladat_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("kérem adja meg a medence átmérőjét(m): ");
		double atemero = sc.nextDouble();
		System.out.print("kérem adja meg a medence mélységét(m): ");
		double melyseg = sc.nextDouble();
		double sugar = atemero / 2;
		double terulet = sugar * sugar * Math.PI;
		double terfogat = terulet * melyseg;
		System.out.printf("a medencébe %.2f köbméter víz fér.", terfogat);
	}
}
