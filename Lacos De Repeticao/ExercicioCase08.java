package Exercicios;

import java.util.Scanner;

public class ExercicioCase08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		
        float dinheiro = 1000,saque,valor,deposito;
        int op;

        
        System.out.println("Escolha uma opção: ");
        System.out.println("\n1-\tSaldo");
        System.out.println("\n2-\tSaque");
        System.out.println("\n3-\tDepósito");

        op = read.nextInt();
        
        switch(op) {
        
        case 1:
            System.out.printf("O seu saldo é: R$ %.2f",dinheiro);
            break;
        case 2: 
            System.out.println("Digite o valor para saque ");
            saque = read.nextFloat();
            if(saque>dinheiro) {
                System.out.println("Saldo insulficiente!");
            }else {
                valor = dinheiro-saque;
                System.out.printf("Seu saldo agora é %.2f",valor);
            }
            
            break;
            
        case 3:
            System.out.println("Digite o valor para deposito: ");
            deposito = read.nextFloat();
            valor = deposito+dinheiro;
            System.out.println("Saldo atualizado: ");
            System.out.printf("Seu saldo agora é %.2f", valor);
            break;
            default:
                System.out.println("Operação inválida!");
        }
    }

}

