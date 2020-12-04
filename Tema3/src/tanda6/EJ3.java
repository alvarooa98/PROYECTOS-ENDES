package tanda6;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int x;
		do {
			System.out.println("Introduzca un número entre el 10 y el 100:");
			x=teclado.nextInt();
		}while(x>=10&&x<=100);
		System.out.println("Numero incorrecto");
		
		
		
		
		teclado.close();
	}

}
