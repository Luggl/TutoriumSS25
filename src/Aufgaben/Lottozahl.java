package Aufgaben;

public class Lottozahl {
    private int wert;
    Lottozahl next;
    public Lottozahl(int wert){
        this.wert = wert;
    }
    public int getWert(){
        return wert;
    }
}
