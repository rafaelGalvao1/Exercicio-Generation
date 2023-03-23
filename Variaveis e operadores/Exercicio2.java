package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[]nota=new float[5];
		float media;
		int i;
		
		Scanner leia = new Scanner(System.in);
		
		for(i=1;i<=4;i++) {
			System.out.println("\nEscreva a nota "+i);
			nota[i] = leia.nextFloat();
		}
		
		media = (nota[0]+nota[1]+nota[2]+nota[3])/4;
		System.out.printf("\nA media é: %.1f ", media);

	}

}
