package org.lessons.java;

public class Smarphone extends Prodotto {
	
	int codiceImei;
	int quantitaMemoria;
	
	public Smarphone(int codice, String nome, String marca, float prezzo, int iva, int codiceImei, int quantitaMemoria) {
		super(codice, nome, marca, prezzo, iva);

		setCodiceImei(codiceImei);
		setQuantitaMemoria(quantitaMemoria);		
	}
	

	public int getCodiceImei() {
		
		return codiceImei;
	}

	public void setCodiceImei(int codiceImei) {
		
		this.codiceImei = codiceImei;
	}

	public int getQuantitaMemoria() {
		
		return quantitaMemoria;
	}

	public void setQuantitaMemoria(int quantitaMemoria) {
		
		this.quantitaMemoria = quantitaMemoria;
	}

	
	@Override
	public String toString() {
		
		return "nome: " + getNome() + " quantita memoria: " + getQuantitaMemoria();
	}
}
