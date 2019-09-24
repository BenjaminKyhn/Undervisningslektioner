package TDD;

public class Hello {
    public static void helloWorld(){
        System.out.println("Hello World!");
    }

    public static void helloNavn(String navn){
        System.out.println("Hello " + navn + "!");
    }

    public static String getHelloNavn(String navn){
        return "Hello " + navn + "!";
    }
}
