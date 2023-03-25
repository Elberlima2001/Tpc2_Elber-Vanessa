import java.util.Scanner;

public class exe2D {
    public static void main(String[] args) {
        Scanner lerInput = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n,temp;
        n = lerInput.nextInt();
        temp = n;
        int soma=0;
        while (n>0){

            if(n%2!=0){
                 soma += n%10;
                 n /= 10;
            }
            else{
                soma += n%2;
                n /= 10;
            }

        }
        System.out.println("A soma dos termos impares do numero "+temp+" é: "+soma);

    }
}
