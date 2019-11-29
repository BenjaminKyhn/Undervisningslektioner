package Interfaces;

public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        pikachu.setNavn("Pikachu");
        pikachu.setGender("Han");
        pikachu.setSkade((short)80);
        pikachu.setNummerPokedex(25);

        System.out.println(pikachu.toString());
    }
}
