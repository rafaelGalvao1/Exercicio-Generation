package Exercicios;

import java.util.Scanner;

public class lacoFor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro intervalo: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite o segundo intervalo: ");
		n2 = leia.nextInt();
		
		if(n1<n2) {
			
			for(;n1<=n2; n1++) {
				if(n1 % 5 == 0 && n1 % 3 == 0) {
					System.out.println(n1+"\nE multiplo de 3 e 5");
				}else {
				}
			
			}
		}else {
			System.out.println("\nIntervalo invalido!");
			}

	}
}
