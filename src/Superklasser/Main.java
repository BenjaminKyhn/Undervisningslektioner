package Superklasser;

public class Main {
    public static void main(String[] args) {
        Studerende benjamin = new Studerende();
        benjamin.navn = "Benjamin"; // fra superclass
        benjamin.alder = 31; // fra superclass
        benjamin.adresse = "Sct. Joergens Park"; // fra superclass
        benjamin.stilling = "Studerende"; // fra superclass
        benjamin.pay = 0; // fra superclass
        benjamin.syg = false; // fra subclass
        System.out.println(benjamin.spise()); // fra superclass
        System.out.println(benjamin.pjaekke()); // fra subclass

        Medarbejdere andras = new Medarbejdere();
        andras.pay = 2147483647;
        andras.navn = "Andras"; //fra superclass
        andras.lokale = "008"; //fra superclass
        System.out.println(andras.navn + andras.getLokale()); //fra superclass
        System.out.println(andras.underviser()); //fra subclass
    }
}
