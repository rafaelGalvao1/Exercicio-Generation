package Exercicios;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Dado um vetor contendo 10 números inteiros não ordenados e 
		 não repetidos, construa um algoritmo que consiga pesquisar dados no 
		 vetor, onde o usuário irá digitar um número e o programa deve exibir 
		 na tela a posição deste número no vetor. Caso o número não seja encontrado,
		  a mensagem: “Não foi encontrado!” deve ser exibida na tela. Veja os exemplos abaixo:
		 */
		
		//2,5,1,3,4,9,7,8,10,6
		
		Scanner leia = new Scanner(System.in);
		
		int numeros[] =  new  int[10];
		int num,x;
		boolean operador=true;
		                              
		numeros[0]=2;
		numeros[1]=5;
		numeros[2]=1;
		numeros[3]=3;
		numeros[4]=4;
		numeros[5]=9;
		numeros[6]=7;
		numeros[7]=8;
		numeros[8]=10;
		numeros[9]=6;
		
		
		
		System.out.println("\nDigit um numero que deseja encontrar: ");
		num = leia.nextInt();
		
		for(x=0; x<10; x++) {
			
			if(numeros[x] == num) {
				System.out.println("\nO numero "+num+ "\nEsta na posição: "+x);
				operador = false;
			}
		}
		if(operador == true) {
			System.out.println("\nNumero não encontrado!!!");
		}
		

	}

}
