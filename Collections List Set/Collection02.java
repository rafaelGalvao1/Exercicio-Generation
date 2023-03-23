package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collection02 {

	public static void main(String[] args) {
		
        List<Integer> minhaLista = new ArrayList<Integer>();


        minhaLista.add(2);
        minhaLista.add(5);
        minhaLista.add(1);
        minhaLista.add(3);
        minhaLista.add(4);
        minhaLista.add(9);
        minhaLista.add(7);
        minhaLista.add(8);
        minhaLista.add(10);
        minhaLista.add(6);
       

        for(Integer ListaElementos:minhaLista) {
            System.out.println(ListaElementos);
        }
        Collections.sort(minhaLista);
        System.out.println("\nLista dos dados ordenados ");
        System.out.println(minhaLista);

        for(Integer ListaElementos:minhaLista) {
            System.out.println(ListaElementos);

        }

        Collections.sort(minhaLista);
        System.out.println("\nLista de elementos Ordenandos ");
        System.out.println(minhaLista);

        System.out.println();

        Set<Integer> myListOrdenada = new HashSet<Integer>();

        myListOrdenada.add(2);
        myListOrdenada.add(5);
        myListOrdenada.add(10);
        myListOrdenada.add(3);
        myListOrdenada.add(4);
        myListOrdenada.add(2);
        myListOrdenada.add(2);
        myListOrdenada.add(3);
        myListOrdenada.add(10);
        myListOrdenada.add(5);

        Iterator<Integer> iMeuSet = myListOrdenada.iterator();

        while(iMeuSet.hasNext()) {

            System.out.println(iMeuSet.next());

        }

    }

}
	
	