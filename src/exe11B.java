import java.util.Scanner;

public class exe11B {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int par=0, impar=0;
        System.out.print("Digite o tamanho da sequência: ");
        int n= input.nextInt();
        while (n>0){
            n--;
            System.out.print("Digite um numero: ");
            int entrada = input.nextInt();
            if(entrada%2==0){
                par++;
            }
            if(entrada%2!=0){
                impar++;
            }
        }
        System.out.print("O numero de entradas par é "+par+" e o numero de entradas impar é "+impar+".");
    }
}
