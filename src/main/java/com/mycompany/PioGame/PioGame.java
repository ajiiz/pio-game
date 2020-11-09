package com.mycompany.PioGame;

import java.util.Random;

public class PioGame {
    public static void main(String[] args) {
        Player player = new PlayerComp("Pio$_-");
        
        try {
            player.setName("");
        } catch (IllegalArgumentException e) {
            System.err.println("Blad! " + e);
        }
        
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