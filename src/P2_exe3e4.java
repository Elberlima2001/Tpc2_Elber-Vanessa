public class P2_exe3e4 {
    public static void main(String[] args) {
        int[] numPrimos= new int[5];
        numPrimos[0]=2;
        numPrimos[1]=3;
        numPrimos[2]=5;
        numPrimos[3]=7;
        numPrimos[4]=11;

        for(int i=4; i>=0;i--){
            System.out.print(numPrimos[i]+" ");
        }
    }
}
