/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 03 - Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os 
seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses 
atributos a classes deve conter os seguintes métodos.
a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de 
litros que foi colocada no veículo
b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o 
valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combustível.
d. alterarCombustivel; //altera o tipo do combustível.
e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
Crie uma classe que contenha um método main para testar sua classe BombaCombustível 
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        BombaCombustivel bc = new BombaCombustivel();

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o tipo de combustível:");
        bc.setTipoCombustivel(leitorScanner.nextLine());
        System.out.println("Digite o valor por litro:");
        bc.setValorLitro(leitorScanner.nextFloat());
        System.out.println("Digite a quantidade de combustível:");
        bc.setQuantidadeCombustivel(leitorScanner.nextFloat());
        
        //operações
        boolean continuar = true;
        
        while (continuar == true) {
            System.out.println("\nDigite qual operação deseja utilizar:\n1 - Imprimir dados\n2 - Abastecer com um determinado valor\n3 - Abastecer com um determinada quantidade de litros\n4 - Alterar o valor do combustível\n5 - Alterar o tipo combustível\n6 - Alterar quantidade de combustível\n7 - Sair\n");
            int operacao = leitorScanner.nextInt();
            switch (operacao) {
                case 1:
                System.out.printf("Tipo de combustível: %s\nValor por litro: %.2f R$\nQuantidade de Combustível: %.2f L\n", bc.getTipoCombustivel(), bc.getValorLitro(), bc.getQuantidadeCombustivel());
                break;

                case 2:
                System.out.println("Quantos reais você deseja abastecer:");
                System.out.printf("Serão abastecidos %.2f L de %s", bc.abastecerValor(leitorScanner.nextFloat()), bc.getTipoCombustivel());
                break;

                case 3:
                System.out.println("Quantos litros você deseja abastecer:");
                System.out.printf("Serão abastecidos %.2f R$ de %s", bc.abastecerLitro(leitorScanner.nextFloat()), bc.getTipoCombustivel());
                break;

                case 4:
                System.out.println("Digite o novo valor do combustível:");
                bc.setValorLitro(leitorScanner.nextFloat());
                break;
                
                case 5:
                System.out.println("Digite o novo tipo do combustível:");
                bc.setTipoCombustivel(leitorScanner.next());
                break;

                case 6:
                System.out.println("Digite a nova quantidade de combustível:");
                bc.setQuantidadeCombustivel(leitorScanner.nextFloat());
                break;

                case 7:
                continuar = false;
                break;

                default:
                System.out.println("Digite uma operação válida.");
            }
        }
        leitorScanner.close();
    }
}