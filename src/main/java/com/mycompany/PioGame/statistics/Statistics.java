package com.mycompany.PioGame.statistics;

public interface Statistics {
    void addStats(String name);
    void print();
    void clear();
}

/* 
    Wszystkie metody w interfejsie sa abstrakcyjne
        - dlatego wystarczy je tylko zaimplementowac
    Wymusza istnienie implementacji tych metod
    Interface implementujemy w klasach - implements
    Mozemy implementowac tyle interfejsow ile chcemy
*/