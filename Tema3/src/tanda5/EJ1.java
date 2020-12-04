package tanda5;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numdia;
		System.out.println("Número de día de la semana: ");
		numdia=teclado.nextInt();
		if(numdia==1) {
			System.out.println("Hoy es Lunes");
		}else if(numdia==2) {
			System.out.println("Hoy es Martes");
		}else if(numdia==3) {
			System.out.println("Hoy es Miércoles");
		}else if(numdia==4) {
			System.out.println("Hoy es Jueves");
		}else if(numdia==5) {
			System.out.println("Hoy es Viernes");
		}else if(numdia==6) {
			System.out.println("Hoy es Sábado");
		}else if(numdia==7) {
			System.out.println("Hoy es Domingo");
		}else {
			System.out.println("Número de día erróneo");
		}
		
		
		
		
		
		teclado.close();
	}

}
