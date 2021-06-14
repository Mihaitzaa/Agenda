package com.mihai;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    public void startAPP(){
    ArrayList<IEveniment> events = new ArrayList();
    System.out.println("1:Adaugare eveniment\n2:Vizualizare evenimente\n3:Editare eveniment\n4:Stergere eveniment\n0:Iesire");
    Scanner sc = new Scanner(System.in);
    int optiune = sc.nextInt();
        while(optiune != 0)

    {
        switch (optiune) {
            case 1: {
                IEveniment ev = new Eveniment();
                ev = ev.creareEveniment();
                events.add(ev);
                break;
            }
            case 2: {
                System.out.println("1:Afisati evenimentele pe o anumita zi \n2:Afisati evenimentele pentru toata saptamana");
                int optiune1 = sc.nextInt();
                switch (optiune1) {
                    case 1: {
                        IEveniment evShow;

                        IData dataShow = new Data("0");

                        int cntr = 0;
                        for (IEveniment event : events) {
                            evShow = event;

                            if (evShow.verificareData(dataShow.getZi())) {
                                evShow.vizualizareEveniment();
                                cntr++;
                            }
                        }
                        if (cntr == 0)
                            dataShow.noEvents();
                        break;
                    }
                    case 2: {
                        IEveniment evShow;
                        for (IEveniment event : events) {
                            evShow = event;
                            evShow.vizualizareEveniment();
                        }
                        if(events.size()==0)
                            System.out.println("Nu sunt evenimente inregistrate in agenda. ");
                    }
                }

                break;
            }
            case 3: {
                IEveniment evEditat;
                System.out.println("Introduceti ziua si ora evenimentului pe care doriti sa-l editati:");

                IData dataEvEditat = new Data();

                for (IEveniment event : events) {
                    evEditat = event;
                    if (evEditat.verificareData(dataEvEditat.getZi(), dataEvEditat.getOra())) {
                        System.out.println(" 1:Editare zi \n 2:Editare ora \n 3:Editare tip \n 4:Editare descriere: \n 0:Incheiere editare");
                        int optiune3 = sc.nextInt();
                        while (optiune3 != 0) {
                            switch (optiune3) {
                                case 1:
                                    evEditat.editareZi();
                                    break;
                                case 2:
                                    evEditat.editareOra();
                                    break;
                                case 3:
                                    evEditat.editareTip();
                                    break;
                                case 4:
                                    evEditat.editareDescriere();
                                    break;
                            }
                            System.out.println(" 1:Editare zi \n 2:Editare ora \n 3:Editare tip \n 4:Editare descriere: \n 0:Incheiere editare");
                            optiune3 = sc.nextInt();
                        }
                    }
                    break;

                }
                break;

            }
            case 4: {
                IEveniment ev;
                System.out.println("Introduceti ziua si ora evenimentului pe care doriti sa-l stergeti.");
                IData dataEvSters = new Data();
                for (int i = 0; i < events.size(); i++) {
                    ev = events.get(i);
                    if (ev.verificareData(dataEvSters.getZi(), dataEvSters.getOra())) {
                        System.out.println("Evenimentul a fost sters.");
                        events.remove(i);
                    }

                }
                break;
            }

        }
        System.out.println("1:Adaugare eveniment \n 2:Vizualizare evenimente \n 3:Editare eveniment \n 4:Stergere eveniment \n 0:Iesire"
        );
        optiune = sc.nextInt();
    }
}}


