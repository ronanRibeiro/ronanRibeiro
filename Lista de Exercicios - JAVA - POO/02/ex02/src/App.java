/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 02 - Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos: 
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e 
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios. 
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        contaCorrente cc = new contaCorrente();

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        cc.setNome(leitorScanner.nextLine());
        System.out.println("Digite o número da conta:");
        cc.setNumeroConta(leitorScanner.nextLine());
        
        //operações
        boolean continuar = true;
        
        while (continuar == true) {
            System.out.println("\nDigite qual operação deseja utilizar:\n1 - Imprimir dados\n2 - Deposito\n3 - Saque\n4 - Alterar nome\n5 - Sair\n");
            int operacao = leitorScanner.nextInt();
            switch (operacao) {
                case 1:
                System.out.printf("Nome: %s\nNúmero da conta: %s\nSaldo: %.2f R$", cc.getNome(), cc.getNumeroConta(), cc.getSaldo());
                break;

                case 2:
                System.out.println("Digite o valor do depóstio:");
                cc.deposito(leitorScanner.nextFloat());
                break;

                case 3:
                System.out.println("Digite o valor do saque:");
                cc.saque(leitorScanner.nextFloat());
                break;

                case 4:
                System.out.println("Digite o novo nome:");
                cc.setNome(leitorScanner.next());
                break;
                
                case 5:
                continuar = false;
                break;

                default:
                System.out.println("Digite uma operação válida.");
            }

        }

        leitorScanner.close();

        //Impressão dos vlores finais
        System.out.printf("Nome: %s\nNúmero da conta: %s\nSaldo: %.2f R$", cc.getNome(), cc.getNumeroConta(), cc.getSaldo());

    }
}