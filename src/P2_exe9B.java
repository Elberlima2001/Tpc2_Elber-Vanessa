
import java.util.Scanner;

public class P2_exe9B {
    public static void main(String[] args) {
        Scanner lerInput= new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int n=lerInput.nextInt();
        int[] numeros = new int[n];
        int prod=1;
        System.out.print("Digite os valores para o array: ");
        for(int i =0; i<numeros.length;i++){
            numeros[i]=lerInput.nextInt();
        }
        for (int num : numeros){
            prod*= num;
        }
        System.out.print("O produto de todos os elementos do array= "+prod);

        }
    }


