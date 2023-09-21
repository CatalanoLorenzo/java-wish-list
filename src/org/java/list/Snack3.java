package org.java.list;

import java.util.Scanner;

public class Snack3 {
public static void main(String[] args) {
	
	
	Scanner input = new Scanner(System.in);
	System.out.println("L'array che stai creando quanto deve essere lungo ?");
	int lunghezzaArray = input.nextInt();
	int[] array = new int[lunghezzaArray];
	for (int i = 0; i < array.length; i++) {
		System.out.print("inserisci un nuro : ");
		array[i]=input.nextInt();
	}
	input.close();
	ElencoDiInteri elenco = new ElencoDiInteri (array);
	
	
	System.out.println(	elenco.getElementoSuccessivo());
	System.out.println( elenco.hasAncoraElementi());
	System.out.println(	elenco.getElementoSuccessivo());


}
}
