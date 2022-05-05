package com;

public class Drank extends Voorgerecht {
    private String drankjesLijst;

    public void addDrankjesLijst(){
        drankjesLijst=String.format("drank 1: frisdrank %ndrank 2:warme drankjes");
    }
    public String getDrankjesLijst(){
        return drankjesLijst;
    }
}
