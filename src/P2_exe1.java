public class P2_exe1 {
    public static void main(String[] args) {
        int linha, col;
        int [] [] board = new int[8][8];
        for (linha=0;linha<8;linha++){
            for(col=0;col<8;col++){
                if((linha+col)%2==0){
                    board[linha][col]=0;
                }else {
                    board[linha][col]=1;
                }
            }
        }
        for (linha=0;linha<8;linha++){
            for(col=0;col<8;col++) {
                System.out.print(board[linha][col]+"  ");
            }
            System.out.println();
        }
    }
}
