package tanda4;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		char opcion;
		int A, B;
		System.out.println("Primero número:");
		A = teclado.nextInt();
		System.out.println("Segundo número:");
		B = teclado.nextInt();
		System.out.println("1.SUMAR\n2.RESTAR\n3.MULTIPLICAR\n4.DIVIDIR\nIntroduce una opción:");
		opcion = teclado.next().charAt(0);
		if (opcion == '1') {
			System.out.println(A + "+" + B + "=" + (A + B));
		} else if (opcion == '2') {
			System.out.println(A + "-" + B + "=" + (A - B));
		} else if (opcion == '3') {
			System.out.println(A + "x" + B + "=" + (A * B));
		} else if (opcion == '4') {
			System.out.println(A + "÷" + B + "=" + (A / B));
		}

		teclado.close();
	}

}
