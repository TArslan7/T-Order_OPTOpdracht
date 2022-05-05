package com;

import java.util.Scanner;

public class Klant {
    private String voornaam;
    private String achternaam;
    private static int klantCode=000;


    Klant(){
    }

    public void bestellingPlaatsenJaOfNee(){
        Scanner scanner = new Scanner(System.in);
        Bestelling bestelling = new Bestelling();

        while (true) {
            System.out.println("Wilt u een bestelling plaatsen: (ja/nee)?");
            String antwoord = scanner.nextLine();
            if (antwoord.equalsIgnoreCase("ja")) {
                bestelling.vraagBezorgMethode();


            } else if (antwoord.equalsIgnoreCase("nee")) {
                System.out.println("Bestelling niet plaatsen!");
                break;
            } else {
                System.out.println("U hebt een vekeerd antwoord ingevoerd.");
            }
        }
    }

    public void vraagVoornaamAchternaamKlant(){
                addVoornaam();
                addAchternaam();
                bestellingPlaatsenJaOfNee();
    }
    public static int getKlantCode(){
        return klantCode++;
    }
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

}
