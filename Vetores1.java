package vetores;

import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		int[] Numeros = new int[5];
		
		for( int i=0; i<Numeros.length; i++)  {
			System.out.println("Digite um número: ");
			Numeros[i] = stdin.nextInt();
		}
		System.out.print("Numeros armazenados: ");
		for( int i=0; i<Numeros.length; i++)  {
			System.out.printf(Numeros[i]+ " ");
		}
		
	stdin.close();
	}
}