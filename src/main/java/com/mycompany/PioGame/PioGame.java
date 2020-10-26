package com.mycompany.PioGame;

import java.util.Random;

public class PioGame {
    public static void main(String[] args) {
        Player player = new PlayerHuman("Piotrek");
        Player playerComp = new PlayerComp("Komputer");
        Random r = new Random();
        int rValue;
        int nValue;
        do {
            rValue = r.nextInt(6)+1;
            nValue = player.guess();
            
            if(rValue != nValue) {
                System.out.println("Pudlo :(");
            }
            
            System.out.println("Kostka: "+ rValue);
            System.out.println(player.getName() + ": " + nValue);
        } while(rValue != nValue);
        System.out.println("Wylosowana: " + rValue + ". Wytypowana: " + nValue + ". Brawo!");
    }
}