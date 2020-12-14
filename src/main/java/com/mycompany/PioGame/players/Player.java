package com.mycompany.PioGame.players;

public abstract class Player {
    
    private String name;
    
    public Player() {
        this.name = "Domyslne imie";
    }
    
    public Player(String name) {
        setName(name);
    }
    
    public abstract int guess();

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if(name != null && name.matches("^[A-Za-z0-9-$_]{5,}$")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nieprawidlowe imie.");
        }
    }
}