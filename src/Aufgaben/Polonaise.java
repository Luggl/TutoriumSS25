package Aufgaben;

public class Polonaise {
    Roboter start;

    public Polonaise(){
        this.start = null;
    }

    public void anhaengen(Roboter in){
        if(start == null){
            start = in;
        }else if(in.getGroeße()<start.getGroeße()){
            in.next = start;
            start = in;
        }else{
            Roboter oldtemp = start;
            Roboter temp = start.next;
            if(temp == null){
                start.next = in;
            }else{
                while(temp.getGroeße()<in.getGroeße()){
                    oldtemp = oldtemp.next;
                    temp = temp.next;
                }
                oldtemp.next = in;
                in.next = temp;
            }
        }
    }

    public void vorstellen(){
        Roboter temp = start;
        while(temp != null){
            System.out.println(temp);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        Roboter a = new Roboter("Oli", 190);
        Roboter b = new Roboter("Lucas", 150);
        Roboter c = new Roboter("Lukas", 151);
        Roboter e = new Roboter ("a", 165);
        Roboter f = new Roboter("a", 188);
        Roboter g = new Roboter ("a", 140);

        Polonaise polonaise = new Polonaise();
        polonaise.anhaengen(a);
        polonaise.anhaengen(b);
        polonaise.anhaengen(c);
        polonaise.anhaengen(e);
        polonaise.anhaengen(f);
        polonaise.anhaengen(g);

        polonaise.vorstellen();
    }
}
