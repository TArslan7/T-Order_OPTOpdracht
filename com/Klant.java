package com;

import java.util.Scanner;

public class Klant {
    private String voornaam;
    private String achternaam;

    Klant(String voornaam, String achternaam){
        this.voornaam=voornaam;
        this.achternaam=achternaam;
    }
    public String getVoornaam(){
        return voornaam;
    }
    public void addVoornaam(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Wat is uw voornaam?");
        voornaam=scanner.nextLine();
    }
    public String getAchernaam(){
        return achternaam;
    }
    public void addAchternaam(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Wat is uw achternaam?");
        achternaam=scanner.nextLine();
    }

}
