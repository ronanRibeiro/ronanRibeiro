/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 10 - Crie uma classe para representar um jogador de futebol, com os atributos:
    a. nome;
    b. posição;
    c. data de nascimento;
    d. nacionalidade;
    e. altura;
    f. peso;
Crie os métodos públicos necessários para getters e setters e também um método para imprimir todos os 
dados do jogador. Crie um método para calcular a idade do jogador e outro método para mostrar quanto 
tempo falta para o jogador se aposentar. Para isso, considere que os jogadores da posição de defesa se 
aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35.

*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o nome do jogador, a posição (defesa, meio-campo ou atacante), a data de nascimentos (no formato dd/MM/yyyy), a nacionalidade, a altura e o peso:");
        JogadorFutebol j = new JogadorFutebol(leitorScanner.nextLine(), leitorScanner.nextLine(), new Data(leitorScanner.nextLine()), leitorScanner.nextLine(), leitorScanner.nextFloat(), leitorScanner.nextFloat());    

        boolean continuar = true;
        int opcao;

        while (continuar == true) {

            System.out.println("\nDigite qual comando deseja selecionar:");
            System.out.println("1 - Imprimir dados");
            System.out.println("2 - Calcular Idade");
            System.out.println("3 - Calcular tempo para aposentar");
            System.out.println("4 - Sair");

            opcao = leitorScanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(j.dadosJogadores());
                    break;
                case 2:
                    System.out.printf("%s tem %d anos.",j.getNome(), j.calcularIdade().getYears());
                    break;
                case 3:
                    System.out.printf("Falta %d anos para %s se aposentar",-j.tempoAposentar(j.getPosicao()).getYears(),j.getNome());
                    break;
                case 4:
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
