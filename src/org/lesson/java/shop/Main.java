package org.lesson.java.shop;

public class Main {
    public static void main(String[] args) {
        // Creazione di un prodotto
        Prodotto prodotto = new Prodotto(1, "Prodotto boh", "Marca boh", 100.0, 22.0);
        System.out.println("Prodotto:");
        prodotto.showInfo();
        System.out.println();

        // Creazione di uno smartphone
        Smartphone smartphone = new Smartphone(2, "Smartphone X", "Marca X", 500.0, 22.0, "1234567890", 128);
        System.out.println("Smartphone:");
        smartphone.showInfo();
        System.out.println("Codice IMEI: " + smartphone.getCodiceIMEI());
        System.out.println("Quantità Memoria: " + smartphone.getQuantitàMemoria() + "GB");
        System.out.println();

        // Creazione di un televisore
        Televisori televisore = new Televisori(3, "Televisore Samsung", "Marca Samsung", 800.0, 22.0, 55, true);
        System.out.println("Televisore:");
        televisore.showInfo();
        System.out.println("Dimensioni: " + televisore.getDimensioni() + " pollici");
        System.out.println("Smart: " + (televisore.isSmart() ? "Sì" : "No"));
        System.out.println();

        // Creazione di cuffie
        Cuffie cuffie = new Cuffie(4, "Cuffie Logitech G40", "Marca Logitech", 150.0, 22.0, "Nero", true);
        System.out.println("Cuffie:");
        cuffie.showInfo();
        System.out.println("Colore: " + cuffie.getColore());
        System.out.println("Wireless: " + (cuffie.isWireless() ? "Sì" : "No"));
    }
}