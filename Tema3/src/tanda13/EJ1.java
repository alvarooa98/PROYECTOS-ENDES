package tanda13;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numveces = 0, numpar=0;
		do {
			System.out.println(numpar+2);
			numpar=numpar+2;
			numveces++;
		} while (numveces <= 49);

		teclado.close();

	}

}
