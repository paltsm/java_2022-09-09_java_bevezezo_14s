package hu.petrik.java_bevezeto;

public class feladat_15 {
	public static void main(String[] args) {
//		Írjon programot, amely kiírja egy 25 elemű, valós értékeket tartalmazó tömb páratlan indexű elemeinek a négyzetét!
		double[] tomb = new double[25];
		System.out.println();
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = Math.random() * 100 - 50;
			if (i % 2 != 0) {
				System.out.print((tomb[i] * tomb[i]) + " ");
			}
		}

	}
}
