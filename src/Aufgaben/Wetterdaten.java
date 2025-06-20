package Aufgaben;

public class Wetterdaten {
    int temperatur;
    int luftfeuchtigkeit;
    String zeitpunkt;
    Wetterdaten next;

    public Wetterdaten(int temperatur, int luftfeuchtigkeit, String zeitpunkt){
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.zeitpunkt = zeitpunkt;
    }

    public static void main(String[] args) {
        Wetterstation wetterstation = new Wetterstation();

//        wetterstation.fuegeWetterdatenHinzu(25, 35, "heute");
//        wetterstation.fuegeWetterdatenHinzu(26,21,"Gestern");

        try {
            System.out.println(wetterstation.durchschnitt());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
