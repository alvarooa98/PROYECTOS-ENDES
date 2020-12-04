package tanda8;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int x, contador = 0;
		do {
			System.out.println("Introduce un número:\nPara finalizar introduzca 0");
			x = teclado.nextInt();
			contador++;
		} while (x != 0);
		System.out.println("Se han introducido: " + contador + " números");

		teclado.close();

	}

}
