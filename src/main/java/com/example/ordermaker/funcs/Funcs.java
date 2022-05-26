package com.example.ordermaker.funcs;

public class Funcs {
    public static  int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
