package tanda14;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int dividendo, divisor, cociente = 0;
		System.out.println("Introduce el dividendo");
		dividendo = teclado.nextInt();
		System.out.println("Introduce el divisor");
		divisor = teclado.nextInt();
		if (dividendo > 0 && divisor > 0) {
			while (dividendo >= divisor) {
				dividendo = dividendo - divisor;
				cociente++;
			}
			System.out.println("El cociente es: " + cociente);
			System.out.println("El resto es: " + dividendo);
		} else {
			System.out.println("Ambos números han de ser mayores de 0");
		}

		teclado.close();
	}

}
