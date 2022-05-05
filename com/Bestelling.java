package com;

public class Bestelling {
    private static Integer bestelnummer=0;

    public static Integer volgendeBestelnummer(){
        return bestelnummer++;
    }
}
