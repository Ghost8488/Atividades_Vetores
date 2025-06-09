package vetores;

import java.util.*;

public class Vetores8 {

	public static void main(String[] args) {
	
		Random Rand = new Random();
		int[] Numeros = new int[5];
		int[] Numerosb = new int[5];	
		
		for(int i=0; i<Numeros.length; i++) {
			int RandNumber = Rand.nextInt(10)+1;
			Numeros[i] = RandNumber;
		}		
		System.out.print("Vetor A: ");
		for(int Num : Numeros) {
			System.out.print(Num+" ");
		}
		for(int i=0; i<Numerosb.length; i++) {
			int RandNumber = Rand.nextInt(10)+1;
			Numerosb[i] = RandNumber;
		}
		System.out.print("\nVetor B: ");
		for(int Num : Numerosb) {
			System.out.print(Num+" ");
		}
		System.out.println("");
		 for (int i =0; i < Numeros.length; i++) {
			 if (Numeros[i] == Numerosb[i]) {
				 System.out.println("Posição "+i+": "+Numerosb[i]);
			 } 
		 }
		 
	}

}
