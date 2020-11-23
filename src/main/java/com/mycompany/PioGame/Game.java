package com.mycompany.PioGame;

import java.util.*;

public class Game {
    private List<Player> players = new ArrayList<>();
    
    public void addPlayer(Player player) {
        players.add(player);
    }
    
    public void play() {
       /* try {
            player.setName("");
        } catch (IllegalArgumentException e) {
            System.err.println("Blad! " + e);
        }*/
        
        Random r = new Random();
        int rValue;
        int nValue;
        boolean again;
        
        if (players.isEmpty()) {
            throw new IllegalStateException("Brak inicjalizacji graczay");
        }
        
        do { 
            rValue = r.nextInt(6)+1;
            again = true;

            for (Player player : players) {
                System.out.println("Gra gracz: "+player.getName());
                nValue = player.guess();

                if (rValue != nValue) {
                    System.out.println("Pudlo :(");
                } else {
                    System.out.println("Gratulacje :)");
                    System.out.println("Wygral " + player.getName());
                    again = false;
                }
            }
        } while(again);
    }
}
