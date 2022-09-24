package hu.petrik.java_bevezeto;

import java.util.Scanner;

public class feladat_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("kérem adjon meg egy szöveget: ");
		String szoveg = sc.nextLine();
		String menuPont = "";
		while (!menuPont.equals("f")) {
			System.out.println("kérem adja meg mit akar tenni a szöveggel: ");
			System.out.println("\ta - nagy betűssé alakítani");
			System.out.println("\tb - kis betűssé alakítani");
			System.out.println("\tc - lekérdezni a hosszát");
			System.out.println("\td - összehasonlítani egy másik szöveggel");
			System.out.println("\te - egy részét kiíratni a szövegnek");
			System.out.println("\tf - kilépni");
			System.out.print("kérem adja meg az elvégzendő művelet betűjelét: ");
			menuPont = sc.nextLine().toLowerCase();
			switch (menuPont) {
				case "a":
					System.out.println(szoveg.toUpperCase());
					break;
				case "b":
					System.out.println(szoveg.toLowerCase());
					break;
				case "c":
					System.out.printf("a szöveg hossza %d karakter\n", szoveg.length());
					break;
				case "d":
					System.out.print("kérem adja meg a másik szöveget: ");
					String masikszoveg = sc.nextLine();
					int osszehasonlitasEredmeny = szoveg.compareTo(masikszoveg);
					if (osszehasonlitasEredmeny == 0) {
						System.out.println("a két szöveg megegyezik");
					} else if (osszehasonlitasEredmeny < 0) {
						System.out.println("az első szöveg előrébb van az ABC-ben");
					} else {
						System.out.println("az második szöveg előrébb van az ABC-ben");
					}
					break;
				case "e":
					System.out.println("kérem adja meg az első kiírandó karakter sorszámát: ");
					int a = sc.nextInt();
					sc.nextLine();
					System.out.println("kérem adja meg az utolsó kiírandó karakter sorszámát: ");
					int b = sc.nextInt();
					sc.nextLine();
					System.out.println(szoveg.substring((a - 1), b));
					break;
				case "f":
					System.out.println("viszlát!");
					break;
				default:
					System.out.println("ilyen menüpont nem létezik");
					break;

			}
		}
	}
}
