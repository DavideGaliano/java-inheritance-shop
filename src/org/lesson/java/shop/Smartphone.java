package org.lesson.java.shop;

public class Smartphone extends Prodotto {
    private String codiceIMEI;
    private int quantitàMemoria;

    public Smartphone(int codice, String nome, String marca, double prezzo, double iva, String codiceIMEI, int quantitàMemoria) {
        super(codice, nome, marca, prezzo, iva);
        this.codiceIMEI = codiceIMEI;
        this.quantitàMemoria = quantitàMemoria;
    }

    public String getCodiceIMEI() {
        return codiceIMEI;
    }

    public void setCodiceIMEI(String codiceIMEI) {
        this.codiceIMEI = codiceIMEI;
    }

    public int getQuantitàMemoria() {
        return quantitàMemoria;
    }

    public void setQuantitàMemoria(int quantitàMemoria) {
        this.quantitàMemoria = quantitàMemoria;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                ", Codice IMEI: " + codiceIMEI +
                ", Quantità Memoria: " + quantitàMemoria + "GB";
    }
}