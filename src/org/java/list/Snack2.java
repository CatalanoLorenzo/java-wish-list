package org.java.list;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Snack2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String parola = "";

		System.out.print("scrivi una parola");
		parola = input.nextLine();

		input.close();
		// mi creo un array di tipo MAP avendo come key i caratteri e come valori gli
		// interi
		Map<Character, Integer> charactersCounterMap = new HashMap<>();
		// ciclo per la lunghezza della parola
		for (int x = 0; x < parola.length(); x++) {

			// creo una variabile carattere contenete il singolo carattere della parola in
			// minuscolo
			char currentChar = parola.toLowerCase().charAt(x);

			// seè gia presente sommo il valore della chiave corrispondente
			if (charactersCounterMap.containsKey(currentChar)) {
				charactersCounterMap.put(currentChar, charactersCounterMap.get(currentChar) + 1);
			} else {
				// senno aggiungo la chiave e gli do un valore di inizializzazione =1
				charactersCounterMap.put(currentChar, 1);
			}
		}

		// mi ciclo all'interno dell'array di tipo MAP con un ciclo Foreach prendendo le
		// key come elementi
		for (Character key : charactersCounterMap.keySet()) {
			// e mi stampo a schermo i risultati
			System.out.println(key + " --> " + charactersCounterMap.get(key));
		}
	}
}