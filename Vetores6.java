package vetores;

import java.util.Random;

public class Vetores6 {

	public static void main(String[] args) {
	
		int[] Numeros = new int[6];
		Random Rand = new Random();
		
		for(int i=0; i<Numeros.length; i++) {
			int RandNumber = Rand.nextInt(10)+1;
			Numeros[i] = RandNumber;
		}
		
		System.out.print("Vetor: ");
        for (int Num : Numeros) {
        	System.out.print(Num+" ");
        }
    	System.out.print("\nVetor ao contrário: ");
		for( int i=5; i>=0; i--)  {
			System.out.printf(Numeros[i]+ " ");
		}
	}

}
