package tanda1;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nombre, apellidos;
		System.out.println("Nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Apellidos: ");
		apellidos = teclado.nextLine();
		System.out.println("Bienvenido " + nombre + " " + apellidos);

		teclado.close();
	}

}
