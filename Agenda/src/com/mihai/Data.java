package com.mihai;
import java.util.Scanner;

public class Data implements IData{

    private String ora;
    private String zi = "Zi nespecificata";

    Scanner sc = new Scanner(System.in);

    public Data(String ora, String zi) {
        this.ora = ora;
        if(zi.equals("Luni") || zi.equals("Marti") || zi.equals("Miercuri") || zi.equals("Joi") || zi.equals("Vineri") || zi.equals("Sambata") || zi.equals("Duminica"))
            this.zi = zi;
        else System.out.println("Zi incorecta.");
    }

    public void editareZi(){

        this.zi = sc.nextLine();
    }

    public void editareOra(){

        this.ora = sc.nextLine();
    }

    public String getOra() {
        return ora;
    }

    public String getZi() {
        return zi;
    }

    public void noEvents() {
        System.out.println("Nu sunt evenimente in acea zi.");
    }

    public Data() {
        System.out.println("Introduceti ora:");
        this.ora = sc.nextLine();
        System.out.println("Introduceti ziua:");
        zi = sc.nextLine();
        if(zi.equals("Luni") || zi.equals("Marti") || zi.equals("Miercuri") || zi.equals("Joi") || zi.equals("Vineri") || zi.equals("Sambata") || zi.equals("Duminica"))
            this.zi = zi;
        else System.out.println("Zi incorecta.");
    }

    public Data(String a)
    {
        System.out.println("Introduceti ziua:");
        zi = sc.nextLine();
        if(zi.equals("Luni") || zi.equals("Marti") || zi.equals("Miercuri") || zi.equals("Joi") || zi.equals("Vineri") || zi.equals("Sambata") || zi.equals("Duminica"))
            this.zi = zi;
        else System.out.println("Zi incorecta, ziua va ramane nespecificata");
    }


}
