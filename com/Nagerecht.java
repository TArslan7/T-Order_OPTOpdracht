package com;

import java.util.ArrayList;

public class Nagerecht{
    private String toetjesLijst;
    private static ArrayList alleNagerechten;
    private ArrayList gekozenNagerechten;

    public void addToetjesLijst(){
        toetjesLijst=String.format("Toetje 1: Ijs%nToetje 2: Appeltaart");
    }
    public String getToetjesLijst(){
        return toetjesLijst;
    }
}
