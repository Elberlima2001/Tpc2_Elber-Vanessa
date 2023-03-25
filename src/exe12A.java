import java.util.Scanner;

public class exe12A {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input= leitura.nextLine();

        for( int i=0; i<input.length();i++){
            char character = input.charAt(i);

            if(Character.isUpperCase(character)){
                System.out.print(character);
            }
        }
        leitura.close();
    }
}
