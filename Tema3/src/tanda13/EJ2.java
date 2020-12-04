package tanda13;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numveces = 0, numimpar = -1;

		do {

			System.out.println(numimpar + 2);
			numimpar = numimpar + 2;

			numveces++;
		} while (numveces <= 74);

		teclado.close();
	}

}
