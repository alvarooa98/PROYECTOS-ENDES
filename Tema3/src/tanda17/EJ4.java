package tanda17;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n, conta=1;
		System.out.println("Introduce el número de filas: ");
		n = teclado.nextInt();
		for (int i = 1; i <= n; i++) {
			for(int columna=1;columna<=i;columna++) {
				System.out.print(conta);
				conta++;
			}
			System.out.println();

		}

		teclado.close();
	}

}
