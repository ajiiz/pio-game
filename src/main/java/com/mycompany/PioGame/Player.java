package com.mycompany.PioGame;

import java.util.Random;

public class Player {
    private Random r = new Random();
    
    public int guess() {
        return r.nextInt(6)+1;
    }
}
