//### Es 1
//Siamo a dicembre, è tempo di pensare alla lista dei regali di Natale e vogliamo creare un programma che memorizzi la nostra lista.
//
//Il programma deve chiedere il nome del regalo da inserire in lista e salvarlo in un `ArrayList` (finchè l’utente non decide di fermarsi).
//
//Ad ogni iterazione mostrare la lunghezza della lista e chiedere all’utente se vuole continuare aggiungendo un nuovo regalo.
//
//Al termine dell’inserimento stampare la lista.
//
//#### Bonus
//- ogni elemento salvato in lista non deve avere solo il nome ma anche a chi è destinato (mamma, papà, cugino,  …)
package org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Snack1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// METODO CON MAP
//	ArrayList<String> listaRegali = new ArrayList<String>();
//	
//	
//	Map<String, String> listaRegaliConDestinatari = new HashMap<>();
//	while(true) {
//		System.out.println(" La tua lista regali ha : " + listaRegali.size() + " articoli ");
//		System.out.print("Quale regalo vuoi inserire nella lista ? :");
//		String nuovoRegalo=input.nextLine() ;
//		
//		if(nuovoRegalo.toLowerCase().equals("fine")) {
//			break;
//		}
//		
//		System.out.print("A chi è destinato il regalo? :");
//		String destinatario=input.nextLine() ;
//		if(listaRegaliConDestinatari.containsKey(destinatario)) {
//			listaRegaliConDestinatari.put(destinatario,listaRegaliConDestinatari.get(destinatario)+ "," + nuovoRegalo);
//		}else {
//			listaRegaliConDestinatari.put(destinatario, nuovoRegalo);
//		}
//
//	
//		listaRegali.add(nuovoRegalo);
//	}
//	System.out.println(	listaRegaliConDestinatari.toString());
		// METODO CON CASS
		String destinatario = null;
		String regalo = null;
		ArrayList<ElementoLista> listaRegali = new ArrayList<ElementoLista>();

		do {
			System.out.println("A chi vuoi fare un regalo? scrivi fine per interompere: ");
			destinatario = input.nextLine();

			if (destinatario.equalsIgnoreCase("fine")) {
				break;
			}
			 while (true) {
	                System.out.println("aggiungi un regalo, scrivi stop per interrompere");
	                String altroRegalo = input.nextLine();
	                 regalo += "," + altroRegalo;
	                if (altroRegalo.toLowerCase().equals("stop")) {
	                    break;
	                }
	            
			}
			

			listaRegali.add(new ElementoLista(regalo, destinatario));
		} while (true);
		input.close();
		// Stampa i regali alla fine
		listaRegali.forEach(elemento -> System.out.println(elemento));
	}

}
