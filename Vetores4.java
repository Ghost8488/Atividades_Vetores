package vetores;

import java.util.Random;

public class Vetores4 {

	public static void main(String[] args) {
	
		int[] Numeros = new int[15];
		int Pares = 0;
		Random Rand = new Random();
		
		for(int i=0; i<Numeros.length; i++) {
			int RandNumber = Rand.nextInt(100)+1;
			Numeros[i] = RandNumber;
		}
			System.out.print("Vetor: ");  
				for(int Num : Numeros )  {		
     			System.out.print(Num+ " ");   
				}
	     for(int i=0; i<Numeros.length; i++) {
	    	 if(Numeros[i] % 2 == 0) {
	    	  Pares++; 
	    	 }
	     }
	     System.out.println("\nA quantidade de números pares é: "+Pares);
	} 
}
