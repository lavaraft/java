import java.util.Scanner;

public class funktionen{
    public static void main(String[] args){
        berechnung("Anna", 100, 0.4);
    }
    static double berechnung (String name, double preis, double rabattsatz){
        double rabatte = preis * rabattsatz;
        double endpreis = preis - rabatte;
        System.out.println(name + ": " + endpreis);

        return preis;
    }

}

