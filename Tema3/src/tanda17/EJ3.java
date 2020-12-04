package tanda17;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int nume1, nume2, sumadivisores1 = 0, sumadivisores2 = 0, i = 1, t = 1;
		System.out.println("Primer número: ");
		nume1 = teclado.nextInt();
		System.out.println("Segundo número: ");
		nume2 = teclado.nextInt();
		// Divisores nume1
		do {
			if (nume1 % i == 0) {
				sumadivisores1 = sumadivisores1 + i;
			}
			i++;
		} while (i <= nume1);
		// Divisores nume2
		do {
			if (nume2 % t == 0) {
				sumadivisores2 = sumadivisores2 + t;
			}
			t++;
		} while (t <= nume2);
		if ((sumadivisores1 - nume1) == nume2) {
			System.out.println("Son amigos");
		} else if (nume1 == (sumadivisores2 - nume2)) {
			System.out.println("Son amigos");
		} else if ((sumadivisores1 - nume1) != nume2 && nume1 != (sumadivisores2 - nume2)) {
			System.out.println("No son amigos");
		}

		teclado.close();
	}

}
