package org.java;

import java.util.Scanner;

public class Catalogo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int risp = -1;
		int iteratore = 0;
		
		Prodotto[] catalogo = new Prodotto[10];
		
		while (risp != 0) {
			
			System.out.println("Premere: \n 0 = Stampare il catalogo \n 1 = Aggiungere un prodotto ");
			risp = sc.nextInt();
			
			if (risp < 0 || risp > 1) {
				
				System.out.println("Valore non valido, ripetere!");
				continue;
			}
			else if (risp == 0) {
				
				for (int i = 0; i < catalogo.length; i++) {
					
					Prodotto p = catalogo[i];
					System.out.println(p);
					System.out.println("\n ------------------------------------ \n");
				}
			}
			else if (risp == 1) {
				
				System.out.println("Aggiungere: \n 1 = Smartphone \n 2 = Televisori \n 3 = Cuffie");
				risp = sc.nextInt();
				
				if (risp < 0 || risp > 3) {
					
					System.out.println("Errore, riprovare da capo!");
					continue;
				}
				else {
					
					System.out.println("Nome");
					String name = sc.next();
					
					System.out.println("Marca");
					String marca = sc.next();
					
					System.out.println("Prezzo");
					double prezzo = sc.nextDouble();
					
					System.out.println("Iva");
					double iva = sc.nextDouble();
					
					if (risp == 1) {
						
						System.out.println("IME");
						int ime = sc.nextInt();	
						
						System.out.println("Memoria");
						int memoria = sc.nextInt();
						
						Smartphone s = new Smartphone(name, marca, prezzo, iva, ime, memoria);
						catalogo[iteratore++] = s;
					}
					else if (risp == 2) {
						
						System.out.println("Dimensione");
						String dimensione = sc.next();	
						
						System.out.println("Smart selezionare: flase | true");
						boolean smart = sc.nextBoolean();
						
						Televisori s = new Televisori(name, marca, prezzo, iva, dimensione, smart);
						catalogo[iteratore++] = s;
					}
					else if (risp == 3) {
						
						System.out.println("Colore");
						String colore = sc.next();	
						
						System.out.println("Wireless selezionare: flase | true");
						boolean wireless = sc.nextBoolean();
						
						Cuffie s = new Cuffie(name, marca, prezzo, iva, colore, wireless);
						catalogo[iteratore++] = s;
					}
				}
			}
		}
		
		sc.close();
	}
}