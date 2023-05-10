package org.lessons.java;

public class Shop {
	
public static void main(String[] args) {
		
		
		Prodotto p = new Prodotto(12345, "test","apple", 1000, 22);
		Smarphone s = new Smarphone(12345, "test","apple", 1000, 22,111,256);
		Televisore t = new Televisore(12345, "test","apple", 1000, 22, 60, true);
		Cuffia c = new Cuffia(12345, "test","apple", 1000, 22, "blue", "wireless");
		
		System.out.println(p);
		System.out.println(s);
		System.out.println(t);
		System.out.println(c);		
	}
}
