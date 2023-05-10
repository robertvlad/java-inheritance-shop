package org.lessons.java;

public class Cuffia extends Prodotto {
	
	String colore;
	String wirelessONo;	
	
	public Cuffia(int codice, String nome, String marca, float prezzo, int iva, String colore, String wireString) {
		
		super(codice, nome, marca, prezzo, iva);		
		
		setColore(colore);
		setWirelessONo(wireString);		
	}


	public String getColore() {
		
		return colore;
	}

	public void setColore(String colore) {
		
		this.colore = colore;
	}

	public String getWirelessONo() {
		
		return wirelessONo;
	}

	public void setWirelessONo(String wirelessONo) {
		
		this.wirelessONo = wirelessONo;
	}

	
	@Override
	public String toString() {
	
		return "nome: " + getNome() + " colore: " + getColore();
	}
}
