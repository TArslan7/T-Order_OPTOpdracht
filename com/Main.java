package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Klant klant = new Klant();


        while (true) {
            try {
                klantMedewerkerEigenaarKeuzeTekst();
                System.out.print("Voer uw keuze in: ");
                int keuze1 = scanner.nextInt();
                System.out.println();

                if (keuze1 == 0) {
                    //System.out.println("U bent een klant!");
                    klant.vraagVoornaamAchternaamKlant();

                } else if (keuze1 == 1) {
                    System.out.println("U bent een medewerker!");
                } else if (keuze1 == 2) {
                    System.out.println("U bent de eigenaar!");
                } else if (keuze1 == 3) {
                    System.out.println("Einde programma!");
                    System.exit(1);
                }
            } catch (InputMismatchException a) {
                System.out.println("U hebt een verkeerde keuze ingevoerd.");
                scanner.nextLine();
            }

        /*System.out.println("Welke gerechten wilt u hebben?");
        Gerecht gerecht=new Gerecht();
        gerecht.addLijst();
        System.out.println(gerecht.getLijst());

        Bestelling bestelling= new Bestelling();
        System.out.println(bestelling.volgendeBestelnummer());
        System.out.println(bestelling.volgendeBestelnummer());//het geeft de volgende bestelnummer (de junit test heb ik nog niet gedaan), dus 1

        Medewerker medewerker = new Medewerker();
        System.out.println(medewerker.volgendeMedewerkerCode());
        System.out.println(medewerker.volgendeMedewerkerCode());//het geeft de volgende medewerkercode (de junit test heb ik nog niet gedaan), dus 101
*/


        }
    }

    public static void klantMedewerkerEigenaarKeuzeTekst() {
        System.out.println("----------"+
                "\n Wat voor soort gebruiker bent u?"+
                "\n Toets een cijfer in:"+
                "\n(0) Klant" +
                "\n(1) Medewerker" +
                "\n(2) Eigenaar" +
                "\n(3) Programma afsluiten"+
                "\n----------");
    }
}
