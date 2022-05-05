package com;

import java.util.Scanner;

public class Medewerker {
    private String voornaam;
    private String achternaam;
    private static Integer medewerkersCode=000;

    public String getVoornaam(){
        return voornaam;
    }
    public void addVoornaam(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Wat is uw voornaam?");
        voornaam=scanner.nextLine();
    }
    public String getAchternaam(){
        return achternaam;
    }
    public void addAchternaam(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Wat is uw achternaam?");
        achternaam=scanner.nextLine();
    }
    public static Integer volgendeMedewerkerCode(){
        return medewerkersCode++;
    }
    public Integer getMedewerkerCode(){
        return medewerkersCode;
    }
}
