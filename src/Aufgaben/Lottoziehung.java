package Aufgaben;

public class Lottoziehung {
    Lottozahl start;
    Lottozahl temp;
    Lottozahl oldtemp;

    public void einfuegen(Lottozahl in){
        if(start == null){
            start = in;
        }else{
            temp = start;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = in;
        }
    }

    public int ziehung(){
        temp = start.next;
        oldtemp = start;
        if(oldtemp != null){
            if(Math.random()*100 >=50){
                int erg = oldtemp.getWert();
                start = start.next;
            }
            while(temp != null){
                if(Math.random()*100 >=50){
                    int erg = temp.getWert();
                    oldtemp.next = temp.next;
                    return (erg);
                }else{
                    temp = temp.next;
                    oldtemp = oldtemp.next;
                }
            }
        }

        return(oldtemp.getWert());
    }


    public static void main(String[] args) {
        Lottoziehung lottoziehung = new Lottoziehung();
        for(int i = 1; i<=49; i++){
            Lottozahl x = new Lottozahl(i);
            lottoziehung.einfuegen(x);

        }

        int[] ergebnis = new int[6];
        for(int i = 0; i < ergebnis.length; i++){
            ergebnis[i] = lottoziehung.ziehung();
        }

        for(int i = 0; i< ergebnis.length;i++){
            System.out.println(ergebnis[i]);
        }
    }
}
