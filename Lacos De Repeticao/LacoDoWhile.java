package Exercicios;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float num, soma=0, multiplos= 0, contNum = 0;
		float media = 0;
		
		
		do {
			System.out.println("\nDigite um numero: ");
			num = leia.nextInt();
			
			if(num % 3 == 0 && num != 0) {
				soma+=num;
				contNum++;
				
			}
			
		}while(num != 0);
		media = soma/contNum;
		System.out.printf("\nA média de todos os números múltiplos de 3 é: %.2f ",media);

	}

}
