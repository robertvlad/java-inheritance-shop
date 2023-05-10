package org.lessons.java;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String marca;
	private float prezzo;
	private int iva;	
	
	public Prodotto(int codice, String nome, String marca, float prezzo, int iva) {
		
		this.codice = codice;
		setIva(iva);
		setMarca(marca);
		setNome(nome);
		setPrezzo(prezzo);		
	}


	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public String getMarca() {
		
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	public float getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(float prezzo) {
		
		this.prezzo = prezzo;
	}

	public int getIva() {
		
		return iva;
	}

	public void setIva(int iva) {
		
		this.iva = iva;
	}

	public int getCodice() {
		
		return codice;
	}	
	
	public String getPrezzoIva() {
		
		float prezzoIva = this.prezzo * (1 + this.iva / 100f);
		
		String prezzoIva1 = String.format("%.2f", prezzoIva);
		
		return prezzoIva1;
	}
	
	
	@Override
	public String toString() {
		
		return "codice: " + getCodice() + " nome: " + getNome() + " prezzo: " + getPrezzo() + " marca: " + getMarca() + " prezzoIva: " + getPrezzoIva();
	}
}
