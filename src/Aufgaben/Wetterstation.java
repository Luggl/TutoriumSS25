package Aufgaben;

public class Wetterstation {
    Wetterdaten start;

    public void fuegeWetterdatenHinzu(int temperatur, int luftfeuchtigkeit, String zeitpunkt){
        Wetterdaten in = new Wetterdaten(temperatur, luftfeuchtigkeit, zeitpunkt);

        if (start == null){
            start = in;
        }else{
            Wetterdaten temp = start;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = in;
        }
    }

    public double durchschnitt() throws NullPointerException{

        int count = 0;
        int summe = 0;

        Wetterdaten temp = start;

        while(temp != null){
            summe += temp.temperatur;
            count++;
            temp = temp.next;
        }

        if(start == null){
            throw new RuntimeException("Liste ist leer");
        }else{
            return((double) summe / count);
        }
    }
}
