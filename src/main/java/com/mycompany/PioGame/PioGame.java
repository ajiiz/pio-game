package com.mycompany.PioGame;

import java.util.Random;

public class PioGame {
    public static void main(String[] args) {
        Player player = new Player();
        Random r = new Random();
        int rValue;
        int nValue;
        do {
            rValue = r.nextInt(6)+1;
            nValue = player.guess();
            
            System.out.println("Kostka: "+ rValue);
            System.out.println("Gracz: "+ nValue);
        } while(rValue != nValue);
        System.out.println("Wylosowana: " + rValue + ". Wytypowana: " + nValue + ". Brawo!");
    }
}
