package tanda7;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int x, y, z;
		System.out.println("Primer n�mero:");
		x = teclado.nextInt();
		System.out.println("Segundo n�mero:");
		y = teclado.nextInt();
		System.out.println("Tercer n�mero:");
		z = teclado.nextInt();
		if(x==y&&x==z) {
			System.out.println("Los tres n�meros son iguales");
		}else if(x==y&&x!=z) {
			System.out.println(x+" y "+y+" son iguales");
		}else if(x!=y&&x==z) {
			System.out.println(x+" y "+z+" son iguales");
		}else if(x!=y&&x!=z&&y==z) {
			System.out.println(y+" y "+z+" son iguales");
		}else {
			System.out.println("No hay relaciones de igualdad");
		}
		
		
		
		
		teclado.close();
	}

}
