/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 34 - Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias: 
a. Infantil A = 5 - 7 anos;
b. Infantil B = 8 - 10 anos;
c. Juvenil A = 11- 13 anos;
d. Juvenil B = 14 - 17 anos;
e. Sênior = 18 - 25 anos.
Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe a idade do nadador:");
        int idade = leitorScanner.nextInt();    
        leitorScanner.close();

        //Impressão da categoria do nadador
        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria Infatil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria Infatil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Categoria Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria Juvenil B");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("Categoria Sênior");
        } else {
            System.out.println("Idade fora da faixa etária.");
        }

    }
}