import java.util.Scanner;

public class exe1C {
    public static void main(String[] args){
        Scanner lerInput = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = lerInput.nextInt();
        int m=2;
        int i=0;
        while (Math.pow(m,i) <= n){
            double res= Math.pow(m,i);
            System.out.print(res+"  ");
            i++;

        }

    }
}
