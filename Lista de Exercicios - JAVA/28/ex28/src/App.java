/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 28 - Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo 
com os seguintes critérios: 
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos; 
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
d. 10% para os demais funcionários.
Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário 
reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa 
vai aumentar sua folha de pagamento;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double salario, salarioMinimo, aumentoFolha = 0;
        String nome;

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe o valor do salário mínimo:");
        salarioMinimo = leitorScanner.nextDouble();

        for (int i = 0; i < 2; i++) {
            System.out.println("\nInforme o nome da pessoa:");
            nome = leitorScanner.next();
            System.out.println("Informe o salário dela:");
            salario = leitorScanner.nextDouble();

            //Teste lógicos dos diferentes valores de aumento
            if (salario < 3 * salarioMinimo) {
                System.out.printf("%s receberá um aumento de %.2f R$ e passará a ganhar %.2f R$.", nome, salario * .5, salario * 1.5);
                aumentoFolha = aumentoFolha + salario * .5;
            } else if (salario <= 10 * salarioMinimo) {
                System.out.printf("%s receberá um aumento de %.2f R$ e passará a ganhar %.2f R$.", nome, salario * .2, salario * 1.2);
                aumentoFolha = aumentoFolha + salario * .2;
            } else if (salario <= 20 * salarioMinimo) {
                System.out.printf("%s receberá um aumento de %.2f R$ e passará a ganhar %.2f R$.", nome, salario * .15, salario * 1.15);
                aumentoFolha = aumentoFolha + salario * .15;
            } else {
                System.out.printf("%s receberá um aumento de %.2f R$ e passará a ganhar %.2f R$.", nome, salario * .1, salario * 1.1);
                aumentoFolha = aumentoFolha + salario * .1;
            }                     
        }
        
        leitorScanner.close();

        //Impressão do aumento da folha
        System.out.printf("\nA empresa aumentará a sua folha de pagamento em %.2f R$", aumentoFolha);
    }
}