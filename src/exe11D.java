import java.util.ArrayList;
import java.util.Scanner;

public class exe11D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o tamanho da sequência: ");
        int n = input.nextInt();
        ArrayList<Integer> duplicados = new ArrayList<>();
        int anterior = input.nextInt();
        while (n > 0) {
            n--;
            System.out.print("Digite um numero: ");
            int entrada = input.nextInt();
            if (entrada == anterior) {
                if(!duplicados.contains(entrada)) {
                    duplicados.add(entrada);
                }
            }
            anterior = entrada;
        }
        System.out.println("\nNumeros duplicados: ");
        for (int i = 0; i < duplicados.size(); i++) {
            System.out.print(duplicados.get(i) + " ");
        }
    }

}
