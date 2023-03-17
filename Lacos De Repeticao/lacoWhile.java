package Exercicios;

import java.util.Scanner;

public class lacoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		/*
		 Escreva um algoritmo em Java, que leia a idade de várias pessoas 
		(números inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos
		 e o total de pessoas cuja idade seja maior que 50 anos.
		 A leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o exemplo abaixo: 
		 */
		
		int idade, pessoas21=0, pessoas50=0;
	
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		while(idade > 0) {
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 ) {
				pessoas21++;
			}else if(idade > 50) {
				pessoas50++;
			}
		}
		System.out.println("\nTotal de pessoas cuja idade seja menor que 21 anos: "+pessoas21);
		System.out.println("\nTotal de pessoas cuja idade seja maior que 50 anos: "+pessoas50);

	}

}
