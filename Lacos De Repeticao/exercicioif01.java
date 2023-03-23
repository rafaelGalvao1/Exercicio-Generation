package Exercicios;

import java.util.Scanner;

public class exercicioif01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float A,B,C;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o valor A: ");
		A = leia.nextFloat();
		
		System.out.println("\n Digite o valor B: ");
		B = leia.nextFloat();
		
		System.out.println("\n Digite o valor C: ");
		C = leia.nextFloat();
	
		
		if(A+B > C){
			System.out.println("\n A soma é maior que C: ");
		}
		else if(A+B<C) {
			System.out.println("\n A soma é menor que C: ");
		}
		else {
			System.out.println("\n A soma é Iqual a C: ");
		}
		
		
		
		
	}

}
