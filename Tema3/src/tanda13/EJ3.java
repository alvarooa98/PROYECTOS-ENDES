package tanda13;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numveces = 0, multiploscinco = 0;

		do {

			System.out.println(multiploscinco + 5);
			multiploscinco = multiploscinco + 5;
			numveces++;
		} while (numveces <= 39);

		teclado.close();
	}

}
