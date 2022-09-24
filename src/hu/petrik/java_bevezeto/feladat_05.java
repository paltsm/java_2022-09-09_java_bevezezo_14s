package hu.petrik.java_bevezeto;

import java.util.Scanner;

public class feladat_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("kérem adja meg a téglalap 'a' oldalát (cm): ");
		double a = sc.nextDouble();
		sc.nextLine();
		System.out.print("kérem adja meg a téglalap 'b' oldalát (cm): ");
		double b = Double.parseDouble(sc.nextLine().replace(",", "."));
		System.out.print("kérem adja meg az elvégzendő műveletet (K - kerület, T - terület): ");
		String muvelet = sc.nextLine();
		if (muvelet.equals("K")) {
			double kerulet = 2 * (a + b);
			System.out.printf("a téglalap kerülete %f cm\n", kerulet);
		} else if (muvelet.equals("T")) {
			double terulet = a * b;
			System.out.printf("a téglalap területe %f cm^2\n", terulet);
		} else {
			System.out.println("rossz műveletet adott meg");
		}
		if (a == b) {
			System.out.println("ez egy négyzet");
		}
	}
}
