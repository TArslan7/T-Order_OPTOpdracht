package com;

import java.util.ArrayList;

public class Voorgerecht{
    private String gerechtenLijst;
    private static ArrayList alleVoorgerechten;
    private ArrayList gekozenVoorgerechten;


    public String addLijst(){
        gerechtenLijst=String.format("Gerecht 1: Broodje%nGerecht 2: Soep");
        return gerechtenLijst;
    }

    public String getLijst(){
        return gerechtenLijst;
    }

}
