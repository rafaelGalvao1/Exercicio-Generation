package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,n4,dif;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor1: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nDigite o valor2: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nDigite o valor3: ");
		n3 = leia.nextFloat();
		
		System.out.println("\nDigite o valor4: ");
		n4 = leia.nextFloat();
		
		dif = (n1*n2)-(n3*n4);
		System.out.println("\nDiferença é: "+ dif);
		

	}

}
