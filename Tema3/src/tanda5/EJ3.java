package tanda5;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Introduce un n�mero entero del 1 al 10:");
		num = teclado.nextInt();

		if (num <= 10 && num >= 1 && num % 2 == 0) {
			System.out.println("El n�mero es par");
		}
		if (num <= 10 && num >= 1 && num % 2 == 1) {
			System.out.println("El n�mero es impar");
		}
		if (num > 10 || num < 1) {
			System.out.println("El n�mero introducido es incorrecto");
		}
		teclado.close();

	}
}
