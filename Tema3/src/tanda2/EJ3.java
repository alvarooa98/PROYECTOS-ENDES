package tanda2;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, nota3;
		System.out.println("Nota 1ªEVA:");
		nota1 = teclado.nextDouble();
		System.out.println("Nota 2ªEVA:");
		nota2 = teclado.nextDouble();
		System.out.println("Nota 3ªEVA:");
		nota3 = teclado.nextDouble();
		System.out.println("Nota final: " + (nota1 + nota2 + nota3) / 3);

		teclado.close();
	}

}
