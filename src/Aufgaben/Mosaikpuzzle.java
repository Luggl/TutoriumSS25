package Aufgaben;

public class Mosaikpuzzle {
    boolean[][] motiv;

    public Mosaikpuzzle(boolean[][] motiv){
        this.motiv = motiv;
    }

    public int ermittleHinweiszahl(int zeile, int spalte){
        int out = 0;

        for(int i = zeile -1; i <=zeile+1; i++){
            if(i>=0 && i<motiv.length){
                for(int j = spalte-1; j<=spalte+1; j++){
                    if(j>=0 && j<motiv[i].length){
                        if(motiv[i][j]){
                            out++;
                        }
                    }
                }
            }

        }
        return out;
    }

    @Override
    public String toString(){
        String out ="";
        for(int i = 0; i<motiv.length; i++){
            for(int j = 0; j<motiv[i].length; j++){
                if(motiv[i][j]){
                    out += "1 ";
                }else{
                    out += "0 ";
                }
            }
            out += "\n";
        }
        return out;
    }

    public int[][] hinweiszahlenMatrix(boolean[][] motiv){
        int[][] out = new int[motiv.length][motiv[0].length];

        for(int i = 0; i<out.length; i++){
            for(int j = 0; j<out[i].length; j++){
                out[i][j] = ermittleHinweiszahl(i, j);
            }
        }

        return out;
    }

    public static void main(String[] args) {
        boolean[][] motiv = new boolean[9][9];
        for(int i = 0; i<motiv.length; i++){
            for(int j = 0; j<motiv[i].length; j++){
                if(Math.random() > 0.5){
                    motiv[i][j] = true;
                }else{
                    motiv[i][j] = false;
                }

            }
        }

        Mosaikpuzzle mosaik = new Mosaikpuzzle(motiv);
        System.out.println(mosaik);

        int[][] hinweiszahlen = mosaik.hinweiszahlenMatrix(mosaik.motiv);

        for(int i = 0; i<hinweiszahlen.length; i++){
            for(int j = 0; j<hinweiszahlen[i].length; j++) {
                System.out.print(hinweiszahlen[i][j] + " ");
            }
            System.out.println();
        }
    }
}
