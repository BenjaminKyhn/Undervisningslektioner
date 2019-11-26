package Exceptions;

import java.util.Scanner;
import java.lang.Exception;

public class ExceptionClass {
    public static void main(String[] args) {
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Indtast et tal: ");
            int tal = input.nextInt();

            try {
                System.out.println(100/tal);
            }
            catch (Exception e){
                System.out.println("Du må ikke dele med 0. Fejlkode: " + e);
            }
        }
    }
}
