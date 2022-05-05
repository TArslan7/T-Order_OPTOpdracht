package com;

import java.util.ArrayList;

public class Hoofdgerecht {
    private String naam;
    private double prijs;
    private static ArrayList alleHoofdgerechten;
    private ArrayList gekozenHoofdgerechten;

    public Hoofdgerecht(String naam, double prijs){
        this.naam=naam;
        this.prijs=prijs;
    }

    public static void initialiseerHoofgerechten(){
        alleHoofdgerechten.add(new Hoofdgerecht("Broodje Kip",5.50));
        alleHoofdgerechten.add(new Hoofdgerecht("Vegan Kapsalon",7.50));
        alleHoofdgerechten.add(new Hoofdgerecht("Kapsalon",6.50));
    }

    public void hoofdgerechtTekst(){
        System.out.printf("(0) Broodje Kip €5.50\n(1) Vegan Kapsalon €7.50\n(2) Kapsalon €6.50");
    }
}
