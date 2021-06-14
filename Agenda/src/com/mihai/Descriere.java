package com.mihai;
import java.util.Scanner;

public class Descriere implements IDescriere {

    private String tipEveniment;
    private String descc;

    Scanner sc = new Scanner(System.in);

    public Descriere(String nume, String descc) {
        this.tipEveniment = nume;
        this.descc = descc;
    }

    public Descriere() {
        System.out.println("Tip:");
        this.tipEveniment = sc.nextLine();
    }

    public void editareTip(){
        this.tipEveniment = sc.nextLine();
    }


    public void editareDescriere(){
        this.descc = sc.nextLine();
    }



    public String getTipEveniment() {
        return tipEveniment;
    }

    public void setTipEveniment() {
        this.tipEveniment = sc.nextLine();
    }

    public String getDescc() {
        return descc;
    }

    public void setDescc() {

        this.descc = sc.nextLine();
    }
}
