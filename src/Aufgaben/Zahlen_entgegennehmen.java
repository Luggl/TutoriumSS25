package Aufgaben;

import java.util.Scanner;

public class Zahlen_entgegennehmen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Zahlen möchtest du eingeben?");
        int anzahlZahlen = scanner.nextInt();
        int out = 0;
        for(int i = 1; i<=anzahlZahlen; i++){
            System.out.println("Zahl "+ i + ": ");
            out += scanner.nextInt();
        }
        System.out.println("Die Summe ist: " + out);
    }
}
