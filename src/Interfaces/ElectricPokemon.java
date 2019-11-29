package Interfaces;

/** Eksempel på multinedarvning
 * I java kan en klasse nedarve fra uendelig mange interfaces (polymorfi),
 * men kun fra én superclass. */
public class ElectricPokemon extends Pokemon implements EX, canFly{

    @Override
    public void ex() {
        System.out.println("Jeg er ekstra sej.");
    }

    @Override
    public void fly() {

    }
}
