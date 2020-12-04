package tanda2;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int cantidad;
		System.out.println("Introduce la cantidad");
		cantidad = teclado.nextInt();
		System.out.println("El 10% de la cantidad introducida es: " + (0.1 * cantidad));

		teclado.close();
	}

}
