import java.util.ArrayList;
import java.util.Scanner;

public class exe12E {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = leitura.nextLine();
        ArrayList<Integer> posicoes = new ArrayList<Integer>();

        int contador = 0;
        for (int i = 0; i < input.length(); i++) {
            char caractere = input.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' || caractere == 'A' || caractere == 'E' ||
                    caractere == 'I' || caractere == 'O' || caractere == 'U') {
                posicoes.add(i);
            }
        }
        System.out.println("posiçoes das vogais: ");
        for (int i = 0; i < posicoes.size(); i++) {
            System.out.println(posicoes.get(i) + " ");
        }
    }
}
