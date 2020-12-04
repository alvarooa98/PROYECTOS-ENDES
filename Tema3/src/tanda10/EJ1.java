package tanda10;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumapar = 0, sumaimpar = 0;
		System.out.println("Suma de los números pares comprendidos entre 0 y 200");
		for (int par = 0; par <= 200; par += 2) {
			sumapar = sumapar + par;
		}
		System.out.println(sumapar);
		System.out.println("Suma de los números impares comprendidos entre 0 y 200");
		for (int impar = 1; impar <= 200; impar += 2) {
			sumaimpar = sumaimpar + impar;
		}
		System.out.println(sumaimpar);

	}

}
