package org.java.list;
//#### Bonus
//Prevedere anche un **costruttore che non prenda parametri** 
//e un metodo `addElemento` che permetta di aggiungere un nuovo intero all’elenco da ciclare

public class ElencoDiInteri {
	//---------INIZIALIZZAZIONE VARIABILI PRIVATE-----------
	private int[] array;
	private int counterFunction = 0;
	//--------------------

//	//---------COSTRUTTORE-----------
//	public ElencoDiInteri(int[] arrayDiInteri) {
//		this.setArray(arrayDiInteri);
//	}
//	//--------------------
	
	//---------COSTRUTTORE BONUS-----------
	public ElencoDiInteri() {
	}
	//--------------------

	//---------INIZIALLIZZAZIONI DI FUNZIONI SET E GET-----------
//	public int[] getArray() {
//		return array;
//	}
//
//	public void setArray(int[] array) {
//		this.array = array;
//	}

	public int getCounterFunction() {
		return counterFunction;
	}

	public void setCounterFunction(int counterFunction) {
		this.counterFunction = counterFunction;
	}
	//--------------------

	//-------------FUNZIONI-------
	void addElemento(int elemento){
        int nuovaLunghezzaArray = this.array.length + 1;
        int[] array2= new int[nuovaLunghezzaArray];

        // Copiare gli elementi dall'array originale al nuovo array
        for (int i = 0; i < this.array.length; i++) {
        	array2[i] = this.array[i];
        }

        // Aggiungere il nuovo elemento alla fine del nuovo array
        array2[nuovaLunghezzaArray - 1] = elemento;
         this.array = array2;

        
        
	
	}
	
	int getElementoSuccessivo() {
		int risultato = array[getCounterFunction()];
		this.setCounterFunction(getCounterFunction() + 1);
		return risultato;
	}


	boolean hasAncoraElementi() {
		if(this.getCounterFunction() < array.length) {
			return true;
		}else {
			return false;
		}
	}
	//--------------------


}
