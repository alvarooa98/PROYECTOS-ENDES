package tanda6;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int distancia, numdias;
		System.out.println("Distancia del trayecto");
		distancia = teclado.nextInt();
		System.out.println("Cuantos días entre ida y vuelta?");
		numdias = teclado.nextInt();
		if (numdias > 7 && distancia > 800) {
			System.out.println("El precio del billete es: " + ((2.5 * distancia)-0.3*(2.5*distancia)));
		} else {
			System.out.println("El precio del billete es: " + 2.5 * distancia);
		}

		teclado.close();
	}

}
