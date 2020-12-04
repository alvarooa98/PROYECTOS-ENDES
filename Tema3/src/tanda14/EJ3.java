package tanda14;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int x;
		do {
			System.out.println("Introduce un número mayor o igual que 1000");
			x = teclado.nextInt();
		} while (x >= 1000);
		if (x < 1000) {
			System.out.println("Fin del programa.\nSe ha introducido un número menor que 1000");
		}

		teclado.close();
	}

}
