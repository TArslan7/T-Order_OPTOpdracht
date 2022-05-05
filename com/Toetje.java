package com;

public class Toetje extends Drank{
    private String toetjesLijst;

    public void addToetjesLijst(){
        toetjesLijst=String.format("com.Toetje 1: Ijs%nToetje 2: Gebak");
    }
    public String getToetjesLijst(){
        return toetjesLijst;
    }
}
