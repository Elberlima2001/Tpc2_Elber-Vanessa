import java.util.Scanner;

public class exe12C {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = leitura.nextLine();

        String saida = input.replaceAll("[aeiouAEIOU]","_");
        System.out.println("Saida: "+saida);

    }
}
