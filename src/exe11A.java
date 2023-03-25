import java.util.Scanner;

public class exe11A {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        System.out.print("Digite o tamanho da suquência: ");
        int n= input.nextInt();
        while (n>0){
            n--;
            System.out.print("Digite um numero: ");
            int entrada = input.nextInt();
            if (entrada<menor){
                menor= entrada;
            }
            if(entrada>maior){
                maior= entrada;
            }
        }
        System.out.print("O menor valor é "+menor+" e o maior é "+maior+".");
    }
}
