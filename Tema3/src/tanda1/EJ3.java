package tanda1;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int x, y, suma;
		System.out.println("Primer número");
		x = teclado.nextInt();
		System.out.println("Segundo número");
		y = teclado.nextInt();
		suma = (x * x) + (y * y);
		System.out.println("La suma de sus cuadrados es: " + suma);

		teclado.close();
	}

}
