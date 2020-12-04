package tanda1;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int base, altura;
		System.out.println("Introduce el valor de la base");
		base = teclado.nextInt();
		System.out.println("Introduce el valor de la altura");
		altura = teclado.nextInt();
		System.out.println("El área es: " + (base * altura));

		teclado.close();
	}

}
