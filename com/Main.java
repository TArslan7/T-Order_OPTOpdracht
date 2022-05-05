package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        try {

            while (true) {
                klantMedewerkerEigenaarKeuzeTekst();
                System.out.print("Voer uw keuze in: ");
                int  keuze1 = scanner.nextInt();
                System.out.println();

                if (keuze1==0) {
                    System.out.println("U bent een klant!");
                } else if (keuze1==1) {
                    System.out.println("U bent een medewerker!");
                } else if (keuze1==2) {
                    System.out.println("U bent de eigenaar!");
                }else if (keuze1==3){
                    System.out.println("Einde programma!");
                    System.exit(1);
                }
            }

        }
        catch (InputMismatchException a){
            System.out.println("U hebt een verkeerde keuze ingevoerd.");
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

    public static void klantMedewerkerEigenaarKeuzeTekst() {
        System.out.println("----------"+
                "\nBent u een klant toets dan een (0)." +
                "\nBent u een medewerker, toets dan een (1)." +
                "\nBent u de eigenaar, toets  dan een (2)." +
                "\nVoer een (3) in om dit programma af te sluiten."+
                "\n----------");
    }
}
