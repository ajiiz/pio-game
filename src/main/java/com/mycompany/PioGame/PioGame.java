package com.mycompany.PioGame;

import java.util.*;

public class PioGame {
    public static void main(String[] args) {
        /*
        List<String> list = new ArrayList();
        
        list.add("raz");
        list.add("dwa");
        list.add("trzy");
        
        for (int i = 0; i < list.size(); ++i) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\n---");
        for (String item : list) {
            System.out.print(item+" ");
        }
        
        System.out.println("\n---");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }*/
        
        
        Player player = new PlayerComp("Pio$_-");
        Game game = new Game();
        game.play(player);
    }
}