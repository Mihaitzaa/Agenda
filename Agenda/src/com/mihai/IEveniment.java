package com.mihai;

public interface IEveniment {
    boolean verificareData(String zi);
    boolean verificareData(String zi, String ora);
    void vizualizareEveniment();
    Eveniment creareEveniment();
    Data getData();
    void editareDescriere();
    void editareTip();
    void editareZi();
    void editareOra();
}
