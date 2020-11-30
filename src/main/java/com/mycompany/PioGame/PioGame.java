package com.mycompany.PioGame;

public class PioGame {
    public static void main(String[] args) {        
        Player player = new PlayerHuman("player1");
        Player player2 = new PlayerHuman("player1");
        Game game = new Game();
        game.addPlayer(player);
        game.addPlayer(player2);
        game.printPlayers();
        
        game.printPlayers();
        game.play();
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