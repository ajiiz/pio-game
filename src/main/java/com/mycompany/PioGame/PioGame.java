package com.mycompany.PioGame;

public class PioGame {
    public static void main(String[] args) {  
        Player player = new PlayerComp("Piotrek");
        Player player2 = new PlayerComp("Magda");
        Player player3 = new PlayerComp("Janusz");
        Game game = new Game(new Statistics());
        game.addPlayer(player);
        game.addPlayer(player2);
        game.addPlayer(player3);
        
        for (int i = 0; i < 100; ++i) {
            game.play();
        }

        game.printPlayers();
        game.printStats();
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