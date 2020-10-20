package com.mycompany.PioGame;

import java.util.Random;

public class Player {
    private final Random r = new Random();
    private String name;
    
    public Player() {
        this.name = "Domyslne imie";
    }
    
    public Player(String name) {
        setName(name);
    }
    
    public int guess() {
        return r.nextInt(6)+1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.err.println("Nieprawidlowe imie");
        }
    }
}
