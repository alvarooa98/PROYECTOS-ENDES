package tanda5;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Introduce un n�mero entero: ");
		num=teclado.nextInt();
		if(num%2==0) {
			System.out.println("El n�mero es par");
		}else if(num%2==1) {
			System.out.println("El n�mero es impar");
		}
		
		
		
		
		
		teclado.close();
	}

}
