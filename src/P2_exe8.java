import java.util.Random;


public class P2_exe8 {
    public static void main(String[] args) {

        int[] numAleatorios = new int[10];
        Random generator= new Random();
        System.out.print("Numeros aleatorios: ");
        for (int i=0;i <numAleatorios.length;i++ ){
            numAleatorios[i]= generator.nextInt(100)+1;
            System.out.print(numAleatorios[i]+" ");
        }
    }
}
