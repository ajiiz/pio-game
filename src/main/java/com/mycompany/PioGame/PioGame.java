package com.mycompany.PioGame;

import com.mycompany.PioGame.statistics.WinStatistics;
import com.mycompany.PioGame.players.Player;
import com.mycompany.PioGame.players.PlayerComp;

public class PioGame {
    public static void main(String[] args) {  
        Player player = new PlayerComp("Piotrek");
        Player player2 = new PlayerComp("Magda");
        Player player3 = new PlayerComp("Janusz");
        Game game = new Game(new WinStatistics());
        Game game2 = new Game(null);
        game2.addPlayer(player);
        game2.addPlayer(player2);
        game2.addPlayer(player3);
        
        for (int i = 0; i < 100; ++i) {
            game2.play();
        }

        game2.printPlayers();
        game2.printStats();
    }
}


/*
        Listy
        
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