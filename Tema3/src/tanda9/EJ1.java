package tanda9;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int suma = 0;
		for (int x = 0; x <= 99; x += 3) {
			suma += x;
		}
		System.out.println("La suma de la serie de números 3, 6, 9, 12, ..., 99 es: " + suma);

		teclado.close();
	}

}
