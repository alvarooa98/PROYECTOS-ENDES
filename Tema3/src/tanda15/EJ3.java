package tanda15;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num, digitos = 0;
		System.out.println("Introduce el primer n�mero(entero y positivo)");
		num = teclado.nextInt();
		while (num != 0) {
			num = num / 10;
			digitos++;
		}

		System.out.println("�l n�mero introducido tiene: " + digitos + " d�gitos");

		teclado.close();
	}

}
