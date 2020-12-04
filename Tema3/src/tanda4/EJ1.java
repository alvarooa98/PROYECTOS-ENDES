package tanda4;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		char respuesta;
		System.out.println("Quieres continuar(s/n):");
		respuesta = teclado.next().charAt(0);
		if (respuesta == 's' || respuesta == 'n') {
			System.out.println("La respuesta es correcta y es: " + respuesta);
		} else {
			System.out.println("La respuesta es incorrecta no es ni una “s” ni una “n” ");
		}

		teclado.close();
	}

}
