package Interfaces;

public class Pokemon {
    private String navn, type, gender, udviklesFra, udviklesTil;
    private int nummerPokedex;
    private short skade;

    public Pokemon(){

    }

    //toString-metoden vil normalt vise en reference
    //Vi viser en meningsfuld beskrivelse i stedet
    @Override
    public String toString(){
        String beskrivelse =
                "Pokemon " +
                        navn + " nr. " +
                        nummerPokedex +
                        " er en " +
                        gender.toLowerCase() +
                        ".";
        return beskrivelse;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUdviklesFra() {
        return udviklesFra;
    }

    public void setUdviklesFra(String udviklesFra) {
        this.udviklesFra = udviklesFra;
    }

    public String getUdviklesTil() {
        return udviklesTil;
    }

    public void setUdviklesTil(String udviklesTil) {
        this.udviklesTil = udviklesTil;
    }

    public int getNummerPokedex() {
        return nummerPokedex;
    }

    public void setNummerPokedex(int nummerPokedex) {
        this.nummerPokedex = nummerPokedex;
    }

    public short getSkade() {
        return skade;
    }

    public void setSkade(short skade) {
        this.skade = skade;
    }
}
