package org.lesson.java.shop;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				Carrello carrello = new Carrello();
				Prodotto prodotto = null;

				while (true) {
				    System.out.println("Inserisci il tipo di prodotto (1: Smartphone, 2: Televisore, 3: Cuffie, 4: Esci): ");
				    int scelta = scanner.nextInt();
				    scanner.nextLine(); 

				    if (scelta == 4) {
				        break;
				    }

				    System.out.print("Codice prodotto: ");
				    int codice = scanner.nextInt();
				    scanner.nextLine(); 

				    System.out.print("Nome prodotto: ");
				    String nome = scanner.nextLine();

				    System.out.print("Marca: ");
				    String marca = scanner.nextLine();

				    System.out.print("Prezzo: ");
				    double prezzo = scanner.nextDouble();

				    System.out.print("IVA: ");
				    double iva = scanner.nextDouble();
				    scanner.nextLine(); 			    

				    //In base alla tipologia di prodotto variano le domande successive
				    switch (scelta) {
				        case 1:
				            System.out.print("Codice IMEI: ");
				            String codiceIMEI = scanner.nextLine();

				            System.out.print("Quantità Memoria (GB): ");
				            int quantitaMemoria = scanner.nextInt();
				            scanner.nextLine(); 

				            prodotto = new Smartphone(codice, nome, marca, prezzo, iva, codiceIMEI, quantitaMemoria);
				            break;
				        case 2:
				            System.out.print("Dimensioni (pollici): ");
				            int dimensioni = scanner.nextInt();

				            System.out.print("Smart (true/false): ");
				            boolean smart = scanner.nextBoolean();
				            scanner.nextLine(); 

				            prodotto = new Televisori(codice, nome, marca, prezzo, iva, dimensioni, smart);
				            break;
				        case 3:
				            System.out.print("Colore: ");
				            String colore = scanner.nextLine();

				            System.out.print("Wireless (true/false): ");
				            boolean wireless = scanner.nextBoolean();
				            scanner.nextLine(); 

				            prodotto = new Cuffie(codice, nome, marca, prezzo, iva, colore, wireless);
				            break;
				        default:
				            System.out.println("Scelta non valida. Riprova.");
				            continue;
				    }

				    carrello.aggiungiProdotto(prodotto);
				}

				System.out.println("\nCarrello:");
				carrello.visualizzaProdotti();
			}
	    }
	}
