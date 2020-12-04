package tanda4;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double radio;
		char opcion;
		System.out.println("Introduce el radio:");
		radio = teclado.nextDouble();
		System.out.println("1.Calculo de AREA de una circunferencia\n"
				+ "2.Calculo de la longitud de una circunferencia" + "\nIntroduce una opción: ");
		opcion = teclado.next().charAt(0);
		if (opcion == '1') {
			System.out.println("El área es: " + Math.PI * radio * radio);
		} else if (opcion == '2') {
			System.out.println("La longitud es: " + 2 * Math.PI * radio);
		}
		teclado.close();
	}

}
