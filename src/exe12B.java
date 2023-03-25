import java.util.Scanner;

public class exe12B {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = leitura.nextLine();

        for (int i = 1; i < input.length(); i+=2) {
            char character = input.charAt(i);
            System.out.print(character);
        }
        leitura.close();
    }
}
