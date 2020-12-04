package tanda17;

import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int dinero;
		System.out.println("Introduce la cantidad sin céntimos");
		dinero=teclado.nextInt();
		if(dinero<500&&dinero<1000) {
			System.out.println("Un billete de 500€");
			for(int i=0;i<=(dinero-500);i++) {
				
			}
		}

		teclado.close();
	}

}
