/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 17 -  O agendamento de compromissos é uma das tarefas mais comuns para profissionais. Um sistema com essa 
finalidade deve ser capaz de gerenciar compromissos, atribuindo a cada um o seu tipo (reunião, pagamento, 
entrega de projeto); data; nome do participante ( pessoa, empresa etc) alguém com quem acontecerá é o 
compromisso) e seu telefone. Desenvolva um sistema que seja capaz de fazer operações básicas como 
agendar, remover e alterar compromissos e exibir compromissos por participante e por data.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        Agenda a = new Agenda();   

        boolean continuar = true;
        int opcao;

        while (continuar == true) {

            System.out.println("\nDigite qual comando deseja selecionar:");
            System.out.println("1 - Armazenar um compromisso");
            System.out.println("2 - Remover um compromisso");
            System.out.println("3 - Alterar um compromisso");
            System.out.println("4 - Imprimir a agenda por pessoa");
            System.out.println("5 - Imprimir a agenda por data");
            System.out.println("6 - Imprimir toda a agenda");
            System.out.println("7 - Sair");

            opcao = leitorScanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome, tipo de compromisso, telefone e a data (no formato dd/MM/yyyy) que deseja armazenar.");
                    a.armazenar(leitorScanner.next(), leitorScanner.next(), leitorScanner.next(), leitorScanner.next());
                    break;
                case 2:
                    System.out.println("Digite o índice do compromisso que deseja remover");
                    a.remover(leitorScanner.nextInt());
                    break;
                case 3:
                    System.out.println("Digite o nome, tipo de compromisso, telefone, a data (no formato dd/MM/yyyy) e o índice do compromisso que deseja armazenar.");
                    a.alterar(leitorScanner.next(), leitorScanner.next(), leitorScanner.next(), leitorScanner.next(), leitorScanner.nextInt());
                    break;
                case 4:
                    System.out.println("Digite o nome da pessoa que deseja imprimir os compromissos.");
                    a.exibirPessoa(leitorScanner.next());
                    break;
                case 5:
                    System.out.println("Digite a data (no formato dd/MM/yyyy) que deseja imprimir os compromissos.");
                    a.exibirData(leitorScanner.next());
                    break;                
                case 6:
                    a.exibirTudo();
                    break;
                case 7:
                    continuar = false;
                    break;
                default: 
                    System.out.println("\nDigite um comando váldio");
                    break;
            }
        }

        leitorScanner.close();
    }
}
