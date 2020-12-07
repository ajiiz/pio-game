package com.mycompany.PioGame;

import java.util.Map;
import java.util.HashMap;

public class Statistics {
    
    private Map<String, Integer> stats = new HashMap();
    
    public void addStats(String name) {
        int score = stats.getOrDefault(name, 0);
        score++;
        stats.put(name, score);
    }
       
    public void print() {
        stats.forEach((player, score)-> {
            System.out.println(player + ":" + score);
        });
    }
    
    public void clear() {
        stats.clear();
    }
}