package Exercicios;

import java.util.Scanner;

public class Exerciciosif04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String nomeDoador;
		int idadeDoador;
		boolean Doador;
		
		System.out.println("\n Digite o nome do Doador : ");
		nomeDoador = leia.nextLine();
		
		System.out.println("\n Digite a idade do Doador : ");
		idadeDoador = leia.nextInt();
		
		System.out.println("\n Já doou Sangue? : ");
		Doador = leia.nextBoolean();
		
		if (idadeDoador >=18 && idadeDoador <=60) {
			System.out.println(nomeDoador+"\n Esta apto para Doar!!!");
		}
		else if(idadeDoador > 60 && idadeDoador <=69 && Doador == true) {
			System.out.println(nomeDoador+"\n Esta apto para Doar!!!");
		}
		else if(idadeDoador > 60 && idadeDoador <=69 && Doador == false) {
			System.out.println(nomeDoador+"\n Não esta apto para Doar!!!");
		}
		else {
			System.out.println(nomeDoador+"\n Não esta apto para Doar!!!");
		}
		
		
		

	}

}
