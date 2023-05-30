package org.java;

import java.util.Random;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva;
	
	Random rnd = new Random();
	
	public Prodotto(String nome, String marca, double prezzo, double iva) {
		
		this.codice = rnd.nextInt(100000000);
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	public int getCodice() {		
		return codice;
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
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public double getIva() {
		return iva;
	}
	
	public void setIva(double iva) {
		this.iva = iva;
	}
	
	
	public String prezzoIva(double prezzo) {
		
		String price = String.format("%.2f $", (prezzo * iva));
		
		return price;
	}
	
	
	@Override
	public String toString() {
		
		return "| Codice prodotto: " + getCodice() + " | Nome: " + getNome() + " | Marca: " + getMarca() + " | Prezzo senza Iva: " + String.format("%.2f $", getPrezzo()) + " | Prezzo con Iva: " + prezzoIva(prezzo) + " |";
	}
}
