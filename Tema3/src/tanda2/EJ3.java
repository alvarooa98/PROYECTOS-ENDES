package tanda2;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, nota3;
		System.out.println("Nota 1�EVA:");
		nota1 = teclado.nextDouble();
		System.out.println("Nota 2�EVA:");
		nota2 = teclado.nextDouble();
		System.out.println("Nota 3�EVA:");
		nota3 = teclado.nextDouble();
		System.out.println("Nota final: " + (nota1 + nota2 + nota3) / 3);

		teclado.close();
	}

}
