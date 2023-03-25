import java.util.Scanner;

public class exe13 {
    public static void main(String[] args) {
        Scanner lerInput = new Scanner(System.in);
        System.out.print("Digite o tamanho inicial da população de predadores: ");
        int predIni = lerInput.nextInt();
        System.out.print("Digite o tamanho inicial da população de presas: ");
        int preyIni = lerInput.nextInt();
        System.out.print("Digite o número de periodos a simular: ");
        int periodo=lerInput.nextInt();

        System.out.print("Digite a taxa de nascimento de presas: ");
        double A = lerInput.nextDouble();
        System.out.print("Digite a taxa de predação: ");
        double B = lerInput.nextDouble();
        System.out.print("Digite a taxa de mortalidade dos predadores: ");
        double C = lerInput.nextDouble();
        System.out.print("Digite a taxa de aumento de predadores por presa capturada: ");
        double D = lerInput.nextDouble();

        double prey = preyIni;
        double pred= predIni;
        double preyAtual=0;
        double predAtual=0;
        for(int i=1;i<=periodo;i++){
            preyAtual= prey*(1+A-B*pred);
            predAtual= pred*(1-C+D*prey);
            prey = preyAtual;
            pred= predAtual;
        }

        System.out.printf("Periodo %d: Presas= %.2f; Predadores= %.2f",periodo,preyAtual,predAtual);

    }
}
