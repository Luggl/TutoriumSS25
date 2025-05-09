package Aufgaben;

public class Array {
    static int[] zahlen = new int[15];

    public static void init(){
        for(int i = 0; i < zahlen.length; i++){
            zahlen[i] = (int) (Math.random()*100);
        }
    }

    public static void printZahlen(){
        System.out.print("Ursprungsarray: \t");
        for(int i = 0; i < zahlen.length; i++){
            System.out.print(zahlen[i] + " ");
        }
        System.out.println();
    }

    public static void summe(){
        printZahlen();
        int erg = 0;
        for(int i = 0; i < zahlen.length; i++){
            erg += zahlen[i];
        }
        System.out.println("Summe: " + erg);
    }

    public static void durchschnitt(){
        printZahlen();

        int summe = 0;
        for(int i = 0; i< zahlen.length; i++){
            summe += zahlen[i];
        }

        System.out.println("Durchschnitt: " + summe / zahlen.length);
    }

    public static void max(){
        printZahlen();
        int max = 0;
        for(int i = 0; i<zahlen.length; i++){
            if (zahlen[i] >= max){
                max = zahlen[i];
            }
        }
        System.out.println("Maxwert: " + max);
    }

    public static void zaehlen(int gesucht){
        printZahlen();

        int erg = 0;
        for(int i = 0; i< zahlen.length; i++){
            if(zahlen[i] == gesucht){
                erg++;
            }
        }

        System.out.println("Vorkommen von " + gesucht + "--> " + erg + " mal");

    }

    public static void main(String[] args) {
        init();
        max();
        durchschnitt();
        summe();

        zaehlen(15);
    }
}
