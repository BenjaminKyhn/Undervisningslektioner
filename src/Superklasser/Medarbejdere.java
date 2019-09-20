package Superklasser;

public class Medarbejdere extends Brugere {
    int løntrin;

    void forberederUndervisning(){}
    String underviser(){
        return navn + " underviser i lokale " + lokale;
    }
}
