package com.mycompany.lab_1;

import java.util.Random;

public class lab_1 {
    public static void main(String[] args) {
        Random r = new Random();
        int rValue;
        int nValue;
        do {
            rValue = r.nextInt(6)+1;
            nValue = r.nextInt(6)+1;
        } while(rValue != nValue);
        System.out.println("Wylosowana: " + rValue + " ,wytypowana: " + nValue);
    }
}
