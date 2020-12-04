package tanda9;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int x;
		char respuesta;
		do {
			System.out.println("Introduce un número:");
			x = teclado.nextInt();
			if (x % 2 == 1) {
				System.out.println("El número introducido es primo");
			} else {
				System.out.println("El número introducido no es primo");
			}
			System.out.println("¿Quieres continuar?(s/n)");
			respuesta = teclado.next().charAt(0);
		} while (respuesta == 's');
		System.out.println("Fin del programa");

		teclado.close();
	}

}
