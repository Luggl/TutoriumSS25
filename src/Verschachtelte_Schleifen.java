public class Verschachtelte_Schleifen {
    public static void main(String[] args) {

        boolean[][] box = new boolean[5][10];
        boolean check = false;
        box[1][2] = true;
        box[3][7] = true;

        String string;

        for(int i = 0; i<box.length; i++){ //Schleife zum Durchlaufen der Zeilen innerhalb der Matrix

            for(int j = 0; j<box[i].length; j++){ //Schleife zum Durchlaufen der Spalten innerhalb der Matrix

                System.out.print(box[i][j]);
            }
            //System.out.println();
            System.out.print("\n");

        }
    }
}
