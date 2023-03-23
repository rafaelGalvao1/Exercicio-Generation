package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salarioBruto,adicionalNoturno,horasExtras,descontos,salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o salario bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\nDigite o Adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("\nDigite as Horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("\nDigite os Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras *5) -descontos;
		System.out.printf("\nSalario Liquido é: %.2f ", salarioLiquido);

	}
	
}
