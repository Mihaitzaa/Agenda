package com.mihai;

import java.util.Scanner;

public class Eveniment implements IEveniment{

    private Data dataEveniment;
    private Descriere descriere;
    Scanner sc = new Scanner(System.in);

    public Eveniment(Data dataEveniment, Descriere descriere) {
        this.dataEveniment = dataEveniment;
        this.descriere = descriere;

    }

    public Eveniment() {

    }

    public boolean verificareData(String zi) {
        return dataEveniment.getZi().equals(zi);
    }

    public boolean verificareData(String zi, String ora) {
        return dataEveniment.getZi().equals(zi) && dataEveniment.getOra().equals(ora);
    }


    public void vizualizareEveniment() {

        System.out.println(dataEveniment.getZi() + " la ora " + dataEveniment.getOra() + " are loc " + descriere.getTipEveniment() + " cu descrierea " + descriere.getDescc());
    }

    public Eveniment creareEveniment() {

        System.out.println("Introduceti ziua.");
        String zi = sc.nextLine();
        System.out.println("Introduceti ora.");
        String ora = sc.nextLine();
        Data dataEv = new Data(ora, zi);
        System.out.println("Introduceti tipul evenimentului.(intalnire, sedinta, deadline, sala)");
        String tip = sc.nextLine();
        System.out.println("Introduceti descrierea evenimentului.");
        String descr = sc.nextLine();
        Descriere descri = new Descriere(tip, descr);
        return new Eveniment(dataEv, descri);
    }

    public Data getData() {
        return dataEveniment;
    }



    public void editareDescriere() {
        System.out.println("Introduceti noua descriere:");
        descriere.editareDescriere();

    }

    public void editareTip() {
        System.out.println("Introduceti noul tip al evenimentului:");
        descriere.editareTip();
    }

    public void editareZi() {
        System.out.println("Introduceti noua zi:");
        dataEveniment.editareZi();
    }

    public void editareOra() {
        System.out.println("Introduceti noua ora:");
        dataEveniment.editareOra();
    }


}
