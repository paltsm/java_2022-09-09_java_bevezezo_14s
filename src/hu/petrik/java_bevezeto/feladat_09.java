package hu.petrik.java_bevezeto;

public class feladat_09 {
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
