package Exercicios;

import java.util.Scanner;

public class lacofor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int qnt, num, contagemp=0, contagemi=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (qnt = 1; qnt <= 10; qnt ++) {
			System.out.println("Digite o "+qnt+"° número");
			num = leia.nextInt();
			
			if (num % 2 == 0) {
				contagemp++;
			}else {
				contagemi++;
			}
		}
		System.out.println("\n Numero total de pares é: "+contagemp);
		System.out.println("\n Numero total de impares é: "+contagemi);



	}

}
