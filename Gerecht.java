public class Gerecht extends Menu{
    private String gerechtenLijst;


    public String addLijst(){
        gerechtenLijst=String.format("Gerecht 1: Broodje%nGerecht 2: Soep");
        return gerechtenLijst;
    }

    public String getLijst(){
        return gerechtenLijst;
    }

}
