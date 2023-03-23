package Exercicios;

import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario,abono,novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o salario: ");
		salario = leia.nextFloat();
		System.out.println("\nDigite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		System.out.printf("\nSeu novo salrio é: %.2f ", novoSalario);

	}

}
