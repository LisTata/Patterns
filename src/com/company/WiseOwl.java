package com.company;

public class WiseOwl {
    public static void main(String[] args) {
        Singleton owl= Singleton.getInstance();
        System.out.println(owl);

    }
}
class Singleton{
    private static Singleton instance = new Singleton();

    private int wisdom=0;

    private Singleton(){
        System.out.println("there was an old owl");
    }
    public static Singleton getInstance(){
        return instance;
    }

    public void incWisdom(){
        wisdom++;
    }
    public int getWisdom() {
        return wisdom;
    }
}