package tanda7;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int x, y, z;
		System.out.println("Primer n�mero:");
		x = teclado.nextInt();
		System.out.println("Segundo n�mero:");
		y = teclado.nextInt();
		System.out.println("Tercer n�mero:");
		z = teclado.nextInt();
		if (x > y && x > z) {
			System.out.println(x + " es el mayor");
		} else if (y > x && y > z) {
			System.out.println(y + " es el mayor");
		} else {
			System.out.println(z + " es el mayor");
		}

		teclado.close();
	}

}
