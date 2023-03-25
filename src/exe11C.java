import java.util.Scanner;

public class exe11C {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o tamanho da sequência: ");
        int n= input.nextInt();
        int soma = 0;

        int[] res=new int[n];
        while (n>0) {
            n--;
            System.out.print("Digite um numero: ");
            int entrada = input.nextInt();
            soma += entrada;
            res[n]= soma;

        }
        System.out.print("Todos os valores acumulados: ");
        for (int i = res.length-1;i>=0;  i--) {
            System.out.print(res[i] + " ");
        }
    }
}
