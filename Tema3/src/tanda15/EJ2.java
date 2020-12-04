package tanda15;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1, num2, producto = 0;
		System.out.println("Introduce el primer número(entero y positivo)");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número(entero y positivo)");
		num2 = teclado.nextInt();
		while (num2 != 0) {
			producto = producto + num1;
			num2--;
		}
		System.out.println("El resultado de la multiplicación es: " + producto);

		teclado.close();
	}

}
