/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 06 -  Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a 
possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar osvalores 
trocados;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite duas váriaveis A e B respectivamente:");
        int varA = leitorScanner.nextInt();
        int varB = leitorScanner.nextInt();       

        leitorScanner.close();
        
        //Troca das varáveis
        int varC = varA;
        varA = varB;
        varB = varC;

        //Imprimir o resultado
        System.out.printf("O valor trocado de A é %d e de B é %d", varA, varB);
    }
}