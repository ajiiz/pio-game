package com.mycompany.PioGame.statistics;

import java.util.Map;
import java.util.HashMap;

public class WinStatistics implements Statistics {
    
    private Map<String, Integer> stats = new HashMap();
    
    @Override
    public void addStats(String name) {
        int score = stats.getOrDefault(name, 0);
        score++;
        stats.put(name, score);
    }
       
    @Override
    public void print() {
        stats.forEach((player, score)-> {
            System.out.println(player + ":" + score);
        });
    }
    
    @Override
    public void clear() {
        stats.clear();
    }
}