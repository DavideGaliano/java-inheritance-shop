package org.lesson.java.shop;


public class Carrello {
    private Prodotto[] prodotti;
    private int numeroProdotti;

    public Carrello() {
        this.prodotti = new Prodotto[0];
        this.numeroProdotti = 0;
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        Prodotto[] nuovoArray = new Prodotto[numeroProdotti + 1];
        for (int i = 0; i < numeroProdotti; i++) {
            nuovoArray[i] = prodotti[i];
        }
        nuovoArray[numeroProdotti] = prodotto;
        prodotti = nuovoArray;
        numeroProdotti++;
    }

    public void visualizzaProdotti() {
        for (int i = 0; i < numeroProdotti; i++) {
            System.out.println(prodotti[i]);
        }
    }
}
