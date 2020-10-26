package com.mycompany.PioGame;

import java.util.Scanner;

public class PlayerHuman extends Player {
    
    private final Scanner s = new Scanner(System.in);
    
    public PlayerHuman() {
        super();
    }
    
    public PlayerHuman(String name) {
        super(name);
    }
    
    @Override
    public int guess() {
        System.out.println("Podaj liczbe(1-6): ");
        return s.nextInt();
    }
}