package vetores;

import java.util.*;


public class Vetores9 {

	public static void main(String[] args) {
		
	Random Rand = new Random();
	int[] Numeros = new int[10];
	
	for(int i=0; i<Numeros.length; i++) {
		int RandNumber = Rand.nextInt(10)+1;
		Numeros[i] = RandNumber;
	}
	System.out.print("Números gerados: ");
    for(int Num : Numeros) {
    	System.out.print(Num+" ");
    }
    System.out.print("\nNumeros pares: ");
    for(int i=0; i<Numeros.length; i++) {
    	if (Numeros[i] % 2 == 0) {
    		System.out.print(Numeros[i]+" ");
    	}
    }
    System.out.print("\nNumeros impares: ");
    for(int i=0; i<Numeros.length; i++) {
    	if (Numeros[i] % 2 == 1) {
    		System.out.print(Numeros[i]+" ");
    	}
    }
  
    	}
	}
