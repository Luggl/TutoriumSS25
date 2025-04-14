package Aufgaben;

import java.util.Scanner;

public class Passwort {
    public static void main(String[] args) {

        String passwort = "Geheim123";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib das Passwort ein: ");
        boolean check = false;

        while(!check){
            String userEingabe = scanner.nextLine();
            if(userEingabe.equals(passwort)){
                check = true;
                System.out.println("Zugang gewährt!");
            }else if(userEingabe.equals("EXIT")){
                System.out.println("Abgebrochen!");
                break;
            }else{
                System.out.println("Falsch! Versuch es nochmal: ");
            }
        }

    }
}
