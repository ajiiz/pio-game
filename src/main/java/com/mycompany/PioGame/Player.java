package com.mycompany.PioGame;

public abstract class Player {
    
    private String name;
    
    public Player() {
        this.name = "Domyslne imie";
    }
    
    public Player(String name) {
        setName(name);
    }
    
    public abstract int guess();

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.err.println("Nieprawidlowe imie");
        }
    }
}