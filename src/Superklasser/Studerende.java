package Superklasser;

public class Studerende extends Brugere {
    boolean syg = false;

    String pjaekke(){
        if (syg == true)
            return navn + " pjækker";
        else
            return navn + " pjækker ikke";
    }
}
