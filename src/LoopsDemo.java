import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
        //Eksempel på for loop
        for (int i = 0; i <= 100; i++){
            //System.out.println(i);
        }

        //7-tabellen
        /**for (int i = 0; i <= 100; i=i+3)
            //System.out.println(i);*/

        //7-tabellen i omvendt rækkefølge
        /**for (int j = 70; j >= 0; j=j-7)
            System.out.println(j);*/

        //Tæller ned med 2 til -1000
        for (int x = 0; x >= -1000; x=x-2){
            System.out.println(x);
        }

        //Tæller op med 5 fra 42-77
        for (int y = 42; y <= 77; y=y+5){
            System.out.println(y);
        }

        int w = 0;
        while (w < 10){
            w=w+1;
            System.out.println(w);
        }

        //Indlæs nye beskeder indtil man skriver "exit"
        Scanner input = new Scanner(System.in);
        String besked = "fordobleren";
        while (!besked.equals("exit")){
            System.out.println(besked+besked);
            besked = input.nextLine();
        }

        //Denne køres ikke
        /*while (false){
            System.out.println("noget hemmeligt");
        }*/

        //Do while loop
        do {
            System.out.println("Noget hemmeligt");
        } while (false);
    }
}
