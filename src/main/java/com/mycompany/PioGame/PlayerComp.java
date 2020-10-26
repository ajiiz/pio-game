package com.mycompany.PioGame;

import java.util.Random;

public class PlayerComp extends Player {
    
    private final Random r = new Random();
    
    public PlayerComp() {
        super();
    }
    
    public PlayerComp(String name) {
        super(name);
    }
    
    @Override
    public int guess() {
        return r.nextInt(6)+1;
    }
}