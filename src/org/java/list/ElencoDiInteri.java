package org.java.list;

public class ElencoDiInteri {
	//---------INIZIALIZZAZIONE VARIABILI PRIVATE-----------
	private int[] array;
	private int counterFunction = 0;
	//--------------------

	//---------COSTRUTTORE-----------
	public ElencoDiInteri(int[] arrayDiInteri) {
		this.setArray(arrayDiInteri);
	}
	//--------------------

	//---------INIZIALLIZZAZIONI DI FUNZIONI SET E GET-----------
	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getCounterFunction() {
		return counterFunction;
	}

	public void setCounterFunction(int counterFunction) {
		this.counterFunction = counterFunction;
	}
	//--------------------

	//-------------FUNZIONI-------
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
