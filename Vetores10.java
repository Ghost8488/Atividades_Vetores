package vetores;

import java.util.*;

public class Vetores10 {

	public static void main(String[] args) {

		Random Rand = new Random();
		double[] Notas = new double[6];
		double Soma = 0, Media = 0;
		
		for (int i=0; i<Notas.length; i++) {
		double RandNumber = Rand.nextDouble(10)+1;
		Notas[i] = RandNumber;
		}
		for (double Num : Notas) {
			System.out.print(String.format("%.1f ", Num));
		}
		for(int i=0; i<Notas.length; i++) {
			  Soma += Notas[i];
		}
		Media = Soma/6;
		
		System.out.print("\nSua média geral é: ");
		System.out.print(String.format("%.1f ", Media));
	if (Media>7) {
		System.out.println("\nVocê foi aprovado!");    
	}
	else {
		System.out.println("\nVocê foi reprovado!");
	}
	}

}
