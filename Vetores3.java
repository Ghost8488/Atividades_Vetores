package vetores;

import java.util.Random;

public class Vetores3 {

	public static void main(String[] args) {
		
		Random Rand = new Random();
	
		int[] Numeros = new int[8];

		
		for(int i=0; i<Numeros.length; i++) {
			int RandNumber = Rand.nextInt(10)+1;
			Numeros[i] = RandNumber;
		}
		int Maior = Numeros[0];
	        int Menor = Numeros[0];
		
		System.out.print("Numeros gerados: ");
		for( int i=0; i<Numeros.length; i++)  {
			System.out.printf(Numeros[i]+ " ");
		}
		for(int i=1; i<Numeros.length; i++) {
		  if(Numeros[i] > Maior){
			  Maior = Numeros[i];
		  }
		}
		for(int i=1; i<Numeros.length; i++) {
			  if(Numeros[i] < Menor){
				  Menor = Numeros[i];
			  }
			}
		
		System.out.println("\nO maior número é: "+ Maior);
		System.out.println("O menor número é: "+ Menor);
		

	}

}
