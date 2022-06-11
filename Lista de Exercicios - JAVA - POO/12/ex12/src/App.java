/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 12 - Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes 
operações:
    a. void armazenarPessoa(String nome, int idade, float altura); //armazena a pessoa em um array
    b. void removerPessoa(String nome); //remove a pessoa do array
    c. int buscarPessoa(String nome); // informa em que posição da agenda está a pessoa
    d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
    e. void imprimirPessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.
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
            System.out.println("1 - Armazenar uma pessoa");
            System.out.println("2 - Remover uma pessoa");
            System.out.println("3 - Buscar uma pessoa");
            System.out.println("4 - Imprimir a agenda");
            System.out.println("5 - Imprimir uma pessoa");
            System.out.println("6 - Sair");

            opcao = leitorScanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome, a idade e a alutra.");
                    a.armazenarPessoa(leitorScanner.next(), leitorScanner.nextInt(), leitorScanner.nextFloat());
                    break;
                case 2:
                    System.out.println("Digite o nome da pessoa que deseja remover.");
                    a.removerPessoa(leitorScanner.next());
                    break;
                case 3:
                    System.out.println("Digite o nome da pessoa que deseja buscar.");
                    String aux = leitorScanner.next();
                    if (a.buscarPessoa(aux) != -1) {
                        System.out.printf("O código dessa pessoa é: %d", a.buscarPessoa(aux));
                    } else {
                        System.out.println("Não existe alguém cadastrado com esse nome");
                    }
                    break;
                case 4:
                    a.imprimirAgenda();
                    break;
                case 5:
                    System.out.println("Digite o código da pessoa que deseja imprimir os dados.");
                    a.imprimirPessoa(leitorScanner.nextInt());
                    break;
                case 6:
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
