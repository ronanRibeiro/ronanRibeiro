/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 09 - Escreva uma classe em que cada objeto representa um Voo que acontece em determinada data e em 
determinado horário. Cada vôo possui no máximo 100 passageiros, e a classe permite controlar a 
ocupação das vagas. A classe deve ter os seguintes métodos:
    a. Construtor: configura os dados do vôo (recebidos como parâmetro): número do vôo, data (para 
    armazenar a data utilize um objeto da classe Data, criada na questão anterior);
    b. ProximoLivre: retorna o número da próxima cadeira livre
    c. Verifica: verifica se o número da cadeira recebido como parâmetro está ocupada
    d. Ocupa: ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, e retorna 
    verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso 
    contrário
    e. Vagas: retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
    f. GetVoo: retorna o número do vôo
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o número do voo e a data (no formato dd/MM/yyyy):");
        Voo v = new Voo(leitorScanner.nextLine(), new Data(leitorScanner.nextLine()));    

        boolean continuar = true;
        int opcao;

        while (continuar == true) {

            System.out.println("\nDigite qual comando deseja selecionar:");
            System.out.println("1 - Próxima cadeira livre");
            System.out.println("2 - Verificar se a cadeira já está ocupada");
            System.out.println("3 - Ocupar uma cadeira livre");
            System.out.println("4 - Assentos disponiveis");
            System.out.println("5 - Número do voo");
            System.out.println("6 - Sair");
            opcao = leitorScanner.nextInt();

            switch (opcao) {
                case 1:
                    if (v.proximoLivre()==0) {
                        System.out.println("Não há assentos livres");
                    } else {
                        System.out.printf("A cadeira %d está livre.", v.proximoLivre());
                    }
                    break;
                case 2:
                    System.out.println("Digite qual assento você deseja veirifcar a disponibilidade:");
                    if (v.verifica(leitorScanner.nextInt())) {
                        System.out.println("Assento ocupado");
                    } else {
                        System.out.println("Assento livre");
                    }
                    break;
                case 3:
                    System.out.println("Digite qual assento você deseja ocupar:");
                    if (v.ocupa(leitorScanner.nextInt())) {
                        System.out.println("O assento foi reservado com sucesso");
                    } else {
                        System.out.println("Assento já ocupado");
                    }
                    break;
                case 4:
                    System.out.printf("%s", v.vagas());
                    break;
                case 5:
                    System.out.printf("\nO número do voo é: %s", v.getNumeroVoo());
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


