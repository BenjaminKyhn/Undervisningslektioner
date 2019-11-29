package Interfaces;

public class Main {
    public static void main(String[] args) {
        FirePokemon pikachu = new FirePokemon();
        pikachu.setNavn("Pikachu");
        pikachu.setGender("Han");
        pikachu.setSkade((short)80);
        pikachu.setNummerPokedex(25);


        System.out.println(pikachu.toString());
        pikachu.spyIld();
    }
}
