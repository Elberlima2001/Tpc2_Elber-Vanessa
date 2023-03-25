import java.util.Scanner;

public class exe2C {
    public static void main(String[] args) {
        Scanner lerInput = new Scanner(System.in);
        int i,soma=0;
        System.out.println("Digite um numero: ");
        int n1 = lerInput.nextInt();
        System.out.println("Digite outro numero: ");
        int n2 = lerInput.nextInt();
        if(n1<=n2) {
            for (i = n1; i <= n2; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
            System.out.print("A soma de todos numero impares entre " + n1 + " e " + n2 + "= " + soma);
        }else{
            for (i = n2; i <= n1; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
            System.out.print("A soma de todos numero impares entre " + n2 + " e " + n1 + "= " + soma);
        }
    }
}
