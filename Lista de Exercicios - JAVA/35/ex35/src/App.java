/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 35 - Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de 
luz segue a tabela abaixo: 
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe o tipo de cliente (1 - Residencial, 2 - Comercial e 3 - Industrial)");
        int tipoCliente = leitorScanner.nextInt();
        System.out.println("Informe o consumo em kW/h");
        double consumo = leitorScanner.nextDouble();     
        leitorScanner.close();

        //Calculo da conta
        switch (tipoCliente) {
            case 1:
                System.out.printf("A conta de luz é de %.2f R$", consumo * .6);
                break;
            case 2:
                System.out.printf("A conta de luz é de %.2f R$", consumo * .48);
                break;
            case 3:
                System.out.printf("A conta de luz é de %.2f R$", consumo * 1.29);
                break;
            default:
                System.out.println("Informe um tipo de cliente válido.");
        }

    }
}