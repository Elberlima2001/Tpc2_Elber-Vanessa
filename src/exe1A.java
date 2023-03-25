import java.util.Scanner;

public class exe1A {
    public static void main(String[] args){
        Scanner lerInput = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = lerInput.nextInt();
        int m= 0;
        while (m*m < n){
            int res= m*m;
            System.out.print(res+" ");
            m++;
        }

    }
}
