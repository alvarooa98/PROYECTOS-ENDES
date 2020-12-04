package tanda2;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double precio, iva, descuento, preciofinal;
		System.out.println("Introduce el precio sin IVA: ");
		precio=teclado.nextDouble();
		System.out.println("Precio: "+precio);
		iva=0.21*precio;
		System.out.println("IVA: "+iva);
		descuento=0.15*(precio+iva);
		System.out.println("Descuento(15%): "+descuento);
		preciofinal=precio+iva-descuento;
		System.out.println("Precio final: "+preciofinal);
		
		
		
		
		
		teclado.close();
	}

}
