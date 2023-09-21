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

import java.util.ArrayList;
import java.util.Scanner;

public class Snack1 {
public static void main(String[] args) {
	
	ArrayList<String> listaRegali = new ArrayList<String>();
	
	Scanner input = new Scanner(System.in);
	
	while(true) {
		System.out.println(" La tua lista regali ha : " + listaRegali.size() + " articoli ");
		System.out.print("Quale regalo vuoi inserire nella lista ? :");
		String nuovoRegalo=input.nextLine() ;
		
		if(nuovoRegalo.toLowerCase().equals("fine")) {
			break;
		}
		listaRegali.add(nuovoRegalo);
	}
	System.out.println(	listaRegali.toString());

	
}
}
