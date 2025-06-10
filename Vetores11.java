package vetores;

import java.util.Random;

public class Vetores11 {
    
    
   public static void main(String args[])
   { 
  
  Random Rand = new Random();
  int[] Numeros = new int[5];
     int[] Numeros2 = new int[5];
  
  for(int i=0; i<Numeros.length; i++){
    int RandNumber = Rand.nextInt(10)+1;
    Numeros[i] = RandNumber;
    //preenche o primeiro vetor com 5 nimeros aleatórios de 1 a 10
  }
     System.out.print("Vetor1: ");
  for(int Num : Numeros) {
    System.out.print(Num+" ");
    //imprime os valores do primeiro vetor
    }
     for(int i=0; i<=3; i++){
       Numeros2[i+1] = Numeros[i];
       Numeros2[0] = Numeros[4];
     }
     
     System.out.print("\nVetor2: ");
  for(int Num : Numeros2) {
    System.out.print(Num+" ");
    //imprime os valores do segundo vetor
    }
     
   }
}
