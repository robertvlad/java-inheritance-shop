package org.java;

public class Smartphone extends Prodotto{
	
	private int ime;
	private int memoria;

	public Smartphone(String nome, String marca, double prezzo, double iva, int ime, int memoria) {
		
		super(nome, marca, prezzo, iva);
		
		setIme(ime);
		setMemoria(memoria);
	}

	public int getIme() {
		return ime;
	}

	public void setIme(int ime) {
		this.ime = ime;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	
	@Override
	public String toString() {
		
		return super.toString() + " Codice IME: " + getIme() + " | Memoria: " + getMemoria() + " |";
	}
}
