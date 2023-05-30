package org.java;

public class Shop {
	
	public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto("Prodotto generico", "Marca generica", 999.00, 1.22);
		
		System.out.println(p1);
		
		Smartphone s1 = new Smartphone("Prodotto generico", "Marca generica", 999.00, 1.22, 123456789, 128);
		
		System.out.println(s1);
		
		Televisori t1 = new Televisori("Prodotto generico", "Marca generica", 999.00, 1.22, "120x60", true);
		
		System.out.println(t1);
		
		Cuffie c1 = new Cuffie("Prodotto generico", "Marca generica", 999.00, 1.22, "Bianco", true);
		
		System.out.println(c1);
	}
}
