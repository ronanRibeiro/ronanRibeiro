/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 08 - Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe deverá dispor dos 
seguintes métodos:
a. Construtor: define a data que determinado objeto (através de parâmetro), este método verifica se a 
data está correta, caso não esteja a data é configurada como 01/01/0001
b. Compara: recebe como parâmetro um outro objeto da Classe data, compare com a data corrente e 
retorne: 
    i. 0 se as datas forem iguais; 
    ii. 1 se a data corrente for maior que a do parâmetro; 
    iii. -1 se a data do parâmetro for maior que a corrente.
c. GetDia: retorna o dia da data
d. GetMes: retorna o mês da data
e. GetMesExtenso: retorna o mês da data corrente por extenso
f. GetAno: retorna o ano da data
g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
h. Clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os 
mesmos valores de atributos e retorna sua referência pelo método
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite a data no formato dd/MM/yyyy:");
        Data d = new Data(leitorScanner.nextLine());        

        boolean continuar = true;
        int opcao;
        while (continuar == true) {

            System.out.println("\nDigite qual comando deseja selecionar:");
            System.out.println("1 - Compara a data com a data corrente");
            System.out.println("2 - Imprimir o dia");
            System.out.println("3 - Imprimir o mês");
            System.out.println("4 - Imprimir o mês por extenso");
            System.out.println("5 - Imprimir o ano");
            System.out.println("6 - Verificar se o ano é bissexto");
            System.out.println("7 - Clonar os dados");
            System.out.println("8 - Sair");
            opcao = leitorScanner.nextInt();

            switch (opcao) {
                case 1:
                    int teste = d.compara();
                    if (teste == 0) {
                        System.out.println("\nAs datas são iguais.");
                    } else if (teste > 0) {
                        System.out.println("\nA data é posterior a data corrente.");
                    } else {
                        System.out.println("\nA data é anterior a data corrente.");
                    }
                    break;
                case 2:
                    System.out.printf("\nO dia é: %d", d.getDia());
                    break;
                case 3:
                    System.out.printf("\nO mês é: %d", d.getMes());
                    break;
                case 4:
                    System.out.printf("\nO mês é: %s", d.getMesExtenso());
                    break;
                case 5:
                    System.out.printf("\nO ano é: %d", d.getAno());
                    break;
                case 6:
                    System.out.printf("\n%s", d.isBissexto());
                    break;
                case 7:
                    Data d2 = d.clone();
                    break;
                case 8:
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


