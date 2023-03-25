import java.util.Scanner;

public class exe14 {
     public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] vendas = new int[4]; // Array para armazenar as vendas de cada produto
         // Exibe as opções para o usuário


         // Lê a opção escolhida pelo usuário
         int opcao =0;
            while (opcao!=6) { // Loop infinito para manter o programa em execução
                System.out.println("Selecione uma opção:");
                System.out.println("[1] - Sumo");
                System.out.println("[2] - Bolo");
                System.out.println("[3] - Chocolate");
                System.out.println("[4] - Batatas Fritas");
                System.out.println("[5] - Total a pagar");
                System.out.println("[6] - Sair");
                opcao = input.nextInt();
                // Executa a ação correspondente à opção escolhida
                switch (opcao) {
                    case 1:
                        System.out.println("Aqui está o seu Sumo.");
                        vendas[0]++; // Incrementa o contador de vendas de Sumo
                        break;
                    case 2:
                        System.out.println("Aqui está o seu Bolo.");
                        vendas[1]++; // Incrementa o contador de vendas de Bolo
                        break;
                    case 3:
                        System.out.println("Aqui está o seu Chocolate.");
                        vendas[2]++; // Incrementa o contador de vendas de Chocolate
                        break;
                    case 4:
                        System.out.println("Aqui estão as suas Batatas Fritas.");
                        vendas[3]++; // Incrementa o contador de vendas de Batatas Fritas
                        break;
                    case 5:
                        System.out.println(vendas[0] + " itens Sumo vendido");
                        System.out.println(vendas[1] + " itens Bolo vendido");
                        System.out.println(vendas[2] + " itens Chocolate vendido");
                        System.out.println(vendas[3] + " itens Batatas Fritas vendido");
                        break;
                    case 6:
                        System.out.println("Obrigado por utilizar a nossa máquina de venda.");
                        break;
                    default:
                        System.out.print("Opção invalida,por favor escolha uma opção que esteja no menu!!!");

                }
            }
        }
}