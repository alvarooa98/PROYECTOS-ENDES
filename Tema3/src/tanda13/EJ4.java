package tanda13;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		char x;
		do {
			System.out.println("Introduce cualquier caracter \n(Para finalizar introduzca: *)");
			x = teclado.next().charAt(0);
		} while (x != '*');
		System.out.println("Se ha introducido: *");

		teclado.close();
	}

}
