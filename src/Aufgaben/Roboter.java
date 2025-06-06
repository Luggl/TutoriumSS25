package Aufgaben;

public class Roboter {
    private String name;
    private int groeße;
    Roboter next;

    public Roboter(String name, int groeße){
        this.name = name;
        this.groeße = groeße;
    }

    public int getGroeße(){
        return groeße;
    }
    public void setGroeße(int groeße){
        this.groeße = groeße;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        String out = "Hallo ich bin " + name + ", ich bin " + groeße + " Zentimeter groß.";
        return out;
    }

    public static void main(String[] args) {
        Roboter a = new Roboter("Name", 135);
        System.out.println(a);
    }
}
