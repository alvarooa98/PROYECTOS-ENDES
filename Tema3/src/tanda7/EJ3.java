package tanda7;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int hora, mins, sec;
		System.out.println("Introduce la hora:");
		hora = teclado.nextInt();
		System.out.println("Introduce los minutos:");
		mins = teclado.nextInt();
		System.out.println("Introduce los segundos:");
		sec = teclado.nextInt();
		if (hora == 23 && mins == 59 && sec == 59) {
			sec = 00;
			mins = 00;
			hora = 00;
			System.out.println("La hora mas un segundo es: " + hora + ":" + mins + ":" + sec);
		} else if (hora < 23 && mins == 59 && sec == 59) {
			sec = 0;
			mins = 0;
			hora++;
			System.out.println("La hora mas un segundo es: " + hora + ":" + mins + ":" + sec);
		} else if (hora < 23 && mins < 59 && sec == 59) {
			sec = 0;
			mins++;
			System.out.println("La hora mas un segundo es: " + hora + ":" + mins + ":" + sec);
		} else if (hora < 23 && mins < 59 && sec < 59) {
			sec++;
			System.out.println("La hora mas un segundo es: " + hora + ":" + mins + ":" + sec);
		}

		teclado.close();
	}

}
