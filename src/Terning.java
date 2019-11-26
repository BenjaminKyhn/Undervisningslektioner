import java.util.ArrayList;

public class Terning {

    //Terningekast
    int alleKast[] = {2, 2, 2, 6, 1, 3, 4};
    static ArrayList alleKastArrayList = new ArrayList();

    static int kast() {
        int oeje = (int) (Math.random() * 6 + 1);
        return oeje;
    }

    static ArrayList flereKast(int antal) {
        int i = 0;

        while (i < antal) {
            alleKastArrayList.add(Terning.kast());
            i++;
        }
        return alleKastArrayList;
    }

    static final int ANTAL_KAST = 1000;

    public static void main(String[] args) {
        System.out.println("Der er kastet 10 gange: ");
        ArrayList liste2 = Terning.flereKast(10);
        System.out.println(liste2);


        /*
        System.out.println("Der er kastet " + ANTAL_KAST + " gange: ");
        ArrayList liste = Terning.flereKast(ANTAL_KAST);
        liste.forEach((n) -> System.out.println(n));
        */
    }
}
