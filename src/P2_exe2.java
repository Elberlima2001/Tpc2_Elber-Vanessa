public class P2_exe2 {
    public static void main(String[] args) {
        String[][] tabuleiro = new String[3][3];
        tabuleiro[0][0]="x";
        tabuleiro[0][1]=" ";
        tabuleiro[0][2]="o";
        tabuleiro[1][0]="o";
        tabuleiro[1][1]="x";
        tabuleiro[1][2]=" ";
        tabuleiro[2][0]=" ";
        tabuleiro[2][1]="o";
        tabuleiro[2][2]="x";

       for (int i=0; i<3;i++){
           for (int j=0; j<3;j++){
               System.out.print(tabuleiro[i][j]+" ");
           }
           System.out.println();
       }
    }
}
