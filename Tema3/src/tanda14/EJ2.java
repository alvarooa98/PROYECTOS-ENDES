package tanda14;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		char respuesta;
		int suma = 0, num;
		do {
			System.out.println("Introduce un número:");
			num = teclado.nextInt();
			suma = suma + num;
			System.out.println("¿Continuar?S/N");
			respuesta = teclado.next().charAt(0);
		} while (respuesta == 'S');
		if (respuesta == 'N') {
			System.out.println("La suma de los números introducidos es: " + suma);
			System.out.println("Fin del programa");
		}
		teclado.close();
	}

}
