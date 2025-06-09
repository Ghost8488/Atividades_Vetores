package vetores;

import java.util.Random;

public class Vetores2 {

	public static void main(String[] args) {
		
Random rand = new Random();
//iniciando Random.

int SomaT = 0;
int[] Numeros = new int[10];
//Criando uma String vazia com 10 espaços.

for (int i=0; i<Numeros.length; i++) {
	int RandNumber = rand.nextInt(100)+1;
	Numeros[i] = RandNumber;
	//Laço for que gera um número aleatório para cada espaço vazio na String Numeros
}
System.out.print("Numeros gerados: ");
for(int i=0; i<Numeros.length; i++)  {
	System.out.printf(Numeros[i]+ " ");
	//Laço que exibe todos os números gerados
}		
for(int i=0; i<Numeros.length; i++) {
  SomaT += Numeros[i];
  //Laço que soma os números gerados
}
System.out.println("\nSoma total: "+ SomaT);

	}

}
