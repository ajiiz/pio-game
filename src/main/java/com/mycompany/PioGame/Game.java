package com.mycompany.PioGame;

import java.util.*;

public class Game {
    private List<Player> players = new ArrayList<>();
    private Random r = new Random();
    
    public void addPlayer(Player player) {
        if (nameExists(player.getName())) {
            String newName = findUniqueName(player.getName());
            player.setName(newName);
            players.add(player);
        } else {
            players.add(player);
        }
        
    }
    
    private boolean nameExists(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public void removePlayer(String name) {
        Iterator<Player> it = players.iterator();
        while(it.hasNext()) {
            if (it.next().getName().equals(name)) {
                it.remove();
            }
        }
    }
    
    public String findUniqueName(String name) {
        String uniqueName = name;
        do {
            uniqueName += r.nextInt(10);
        } while(nameExists(uniqueName));
        return uniqueName;
    }
    
    public void printPlayers() {
        players.forEach((player) -> {
            System.out.println(player.getName() + " ");
        });
        System.out.println("");
    }
    
    public void play() {
       /* try {
            player.setName("");
        } catch (IllegalArgumentException e) {
            System.err.println("Blad! " + e);
        }*/
        
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

/*
Wersja druga removePlayer

public void removePlayer(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                players.remove(player);
                break;
            }
        }
    }
*/