package vetores;

import java.util.*;

public class Vetores7 {

	public static void main(String[] args) {
		
		int[] Numeros = new int[5];
		Scanner stdin = new Scanner(System.in);
		Random Rand = new Random();
		
		for(int i=0; i<Numeros.length; i++) {
			int RandNumber = Rand.nextInt(10)+1;
			Numeros[i] = RandNumber;
		}
		System.out.println("Digite um número pra definir um multiplicador: ");
		int Mult = stdin.nextInt();
		
		System.out.print("Vetor: ");
		for(int Num : Numeros) {
		System.out.print(Num+" ");
		}
		
		for(int i=0; i<Numeros.length; i++) {
		Numeros[i]=Numeros[i]*Mult;
		}
		System.out.print("\nNovo vetor: ");
		for(int Num : Numeros) {
			System.out.print(Num+" ");
		}
		
		
stdin.close();
	}

}
