import java.util.Scanner;

public class exe12D {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = leitura.nextLine();
        int contador = 0;
        for (int i = 0; i <input.length();i++){
            char caractere = input.charAt(i);
            if (caractere=='a'||caractere=='e'||caractere=='i'||caractere=='o'||caractere=='u'||caractere=='A'||caractere=='E'||
                    caractere=='I'||caractere=='O'||caractere=='U'){
                contador++;
            }
        }
        System.out.println("numero de vogais na string: "+contador);
    }
}
