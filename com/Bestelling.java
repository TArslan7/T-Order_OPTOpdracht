package com;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bestelling {
    private static Integer bestelnummer=000;
    private String bezorgMethode;
    private ArrayList geplaatsteBestelling;

    Bestelling(){

    }


    public static Integer volgendeBestelnummer(){
        return bestelnummer++;
    }

    public void vraagBezorgMethode(){
        Scanner scanner = new Scanner(System.in);


        while (true){
            try {
                System.out.println("-----");
                System.out.println("Kies uw bezorgmethode: \n(0) Hieropeten \n(1) Meenemen \n(2) Thuisbezorgen");
                System.out.println("-----");
                System.out.print("Uw keuze: ");
                int keuze= scanner.nextInt();

                if (keuze==0){
                    bezorgMethode="Hieropeten";
                    gerechtenKiezen();
                }
                else if (keuze==1){
                    bezorgMethode="Meenemen";
                }
                else if (keuze==2){
                    bezorgMethode="Thuisbezorgen";
                }

            }catch (InputMismatchException a){
                System.out.println("U hebt een verkeerd antwoord opgegeven!");
            }
        }


    }

    private void gerechtenKiezen() {

    }
}
