package Superklasser;

public class Brugere {
    String navn;
    String cprNr;
    String adresse;
    String stilling;
    String lokale;
    int alder;
    double pay;

    String spise(){return navn + " spiser";}
    void setLokale(){}
    String getLokale(){return " befinder sig i lokale " + lokale;}
}
