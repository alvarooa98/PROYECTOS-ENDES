package tanda17;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int nume, resto, vuelta = 0;
		System.out.println("Introduce un n�mero:");
		nume = teclado.nextInt();
		while (nume > 0) {
			resto = nume % 10;
			vuelta = vuelta * 10 + resto;
			nume = nume / 10;
		}
		System.out.println("N�mero invertido: " + vuelta);
		teclado.close();
	}

}
