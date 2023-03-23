package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collection01 {

	public static void main(String[] args) {
		
		List<String> cores = new ArrayList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<5;x++) {
			System.out.println("\nDigite a " + x + "° cor: ");
			String adicionar = leia.nextLine();
			cores.add(adicionar);
		}
		System.out.println("\nAs cores adcionadas foram: "+cores);
		Collections.sort(cores);
		System.out.println("\nCores ordenadas em ordem crescente: "+cores);

	}

}
