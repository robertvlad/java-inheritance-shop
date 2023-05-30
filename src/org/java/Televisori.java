package org.java;

public class Televisori extends Prodotto {
	
	private String dimensione;
	private boolean smart;
	
	
	public Televisori(String nome, String marca, double prezzo, double iva, String dimensione, boolean smart) {
		
		super(nome, marca, prezzo, iva);
		
		setDimensione(dimensione);
		setSmart(smart);
	}
	
	
	public String getDimensione() {
		return dimensione;
	}
	public void setDimensione(String dimensione) {
		this.dimensione = dimensione;
	}
	public boolean isSmart() {
		return smart;
	}
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	
	@Override
	public String toString() {
		
		return super.toString() + " Dimensioni: " + getDimensione() + " | Smart: " + isSmart() + " |";
	}
}
