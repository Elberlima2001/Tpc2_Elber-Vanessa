import java.util.Scanner;

public class P2_exe9C {
    public static void main(String[] args) {
        Scanner lerInput= new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int n=lerInput.nextInt();
        int[] numeros = new int[n];
        System.out.print("Digite os valores para o array: ");
        int numNegativos=0;
        for(int i =0; i<numeros.length;i++){
            numeros[i]=lerInput.nextInt();
            if(numeros[i]<0){
                 numNegativos++;
            }
        }
        System.out.print("Foram introduzidos "+numNegativos+" numeros negativos no array.");
    }
}
