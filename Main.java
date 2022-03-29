import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Welke gerechten wilt u hebben?");
        Gerecht gerecht=new Gerecht();
        gerecht.addLijst();
        System.out.println(gerecht.getLijst());

        Bestelling bestelling= new Bestelling();
        System.out.println(bestelling.volgendeBestelnummer());
        System.out.println(bestelling.volgendeBestelnummer());//het geeft de volgende bestelnummer (de junit test heb ik nog niet gedaan), dus 1

        Medewerker medewerker = new Medewerker();
        System.out.println(medewerker.volgendeMedewerkerCode());
        System.out.println(medewerker.volgendeMedewerkerCode());//het geeft de volgende medewerkercode (de junit test heb ik nog niet gedaan), dus 101



    }
}