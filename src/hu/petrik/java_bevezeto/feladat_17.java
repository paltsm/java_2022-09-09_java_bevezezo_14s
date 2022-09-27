package hu.petrik.java_bevezeto;

import java.util.Arrays;

public class feladat_17 {
	public static void main(String[] args) {
//		Írjon programot, amely összeadja két, valós számokat tartalmazó tömb megfelelő elemeit, és az eredményeket egy
//		harmadik tömbben helyezi el!
		double[]elso={1.1,2,3,4,5};
		double[]masodik={1,2,3,4,5.5};
		double[]harmadik=new double[5];
		for (int i = 0; i < elso.length; i++) {
			harmadik[i]=elso[i]+masodik[i];
		}
		System.out.println(Arrays.toString(elso));
		System.out.println("+");
		System.out.println(Arrays.toString(masodik));
		System.out.println("=");
		System.out.println(Arrays.toString(harmadik));
	}
}
