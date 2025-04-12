package L3;

import java.util.Scanner;

public class Wahrheitstabelle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Eingaben");

        String in = scanner.nextLine();
        char a = in.charAt(0);
        char b = in.charAt(1);

        boolean erstesZ = a =='t';
        boolean zweitesZ = b == 't';

        if(a!='f' && a!= 't' && b !='t' && b !='f'){
            System.out.println("Fehlermeldung");
        }else{
            if(!erstesZ & !zweitesZ){
                System.out.println(0);
            }else if(!erstesZ & zweitesZ){
                System.out.println(1);
            }else if(!zweitesZ){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }

//        if(a == 'f'){
//            if(b == 'f'){
//                System.out.println(0);
//            }else if(b == 't'){
//                System.out.println(1);
//            }else{
//                System.out.println("Fehler - der zweite Buchstabe funktioniert nicht");
//            }
//        }else if(a == 't'){
//            if(b == 'f'){
//                System.out.println(2);
//            }else if(b == 't'){
//                System.out.println(3);
//            }else{
//                System.out.println("Fehler ");
//            }
//        }else{
//            System.out.println("Fehler - Eingabe war nicht in Ordnung");
//        }
    }


}
