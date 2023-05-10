package org.lessons.java;

public class Televisore extends Prodotto {
	
	int dimensioni;
	boolean smart;	
	
	public Televisore(int codice, String nome, String marca, float prezzo, int iva, int dimensioni, boolean smart) {
		super(codice, nome, marca, prezzo, iva);		
		
		setDimensioni(dimensioni);
		setSmart(smart);		
	}


	public int getDimensioni() {
		
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		
		return smart;
	}

	public void setSmart(boolean smart) {
		
		this.smart = smart;
	}
	
	
	@Override
	public String toString() {
		
		return "nome: " + getNome() + " dimensioni: " + getDimensioni() + " smart: " + isSmart();
	}
}
