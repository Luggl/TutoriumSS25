package Aufgaben;

public class Rekursion {

    public static void binary(int dezimal){
        if(dezimal>0){
            binary(dezimal/2);
            System.out.print(dezimal%2);
        }
    }
    public static int quersumme(int zahl){
        if(zahl == 0){
            return 0;
        }
        return(zahl % 10 + quersumme(zahl / 10));
    }

    public static void aufsteigend(int zahl){
        if (zahl == 0){
            return;
        }
        aufsteigend(zahl - 1);
        System.out.print(zahl + " ");
    }

    public static void absteigend(int zahl){
        if(zahl == 0){
            return;
        }
        System.out.print(zahl + " ");
        absteigend(zahl -1);
    }

    public static void main(String[] args) {
        System.out.println("Binär von 15: " );
        binary(15);
        System.out.println();
        System.out.println("Quersumme von 423: " + quersumme(423));
        aufsteigend(25);
        System.out.println();
        absteigend(13);
    }
}
