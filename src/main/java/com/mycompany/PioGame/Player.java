package com.mycompany.PioGame;

import java.util.Random;

public class Player {
    private Random r = new Random();
    private String name;
    
    public int guess() {
        return r.nextInt(6)+1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty() && name != null) {
            this.name = name;
        } else {
            System.err.println("Nieprawidlowe imie");
        }
    }
}
