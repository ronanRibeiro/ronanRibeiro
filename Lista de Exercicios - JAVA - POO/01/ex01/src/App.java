/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 01 - Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e 
altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir 
todos dados de uma pessoa. Crie um método para calcular a idade da pessoa. 
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Pessoa p = new Pessoa();

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        p.setNome(leitorScanner.nextLine());
        System.out.println("Informe a sua altura:");
        p.setAltura(leitorScanner.nextFloat());
        System.out.println("Informe o dia do seu nascimento:");
        p.setDiaNascimento(leitorScanner.nextInt());
        System.out.println("Informe o mes do seu nascimento:");
        p.setMesNascimento(leitorScanner.nextInt());
        System.out.println("Informe o ano do seu nascimento:");
        p.setAnoNascimento(leitorScanner.nextInt());     
        leitorScanner.close();

        System.out.printf("%s tem %d anos e %.2f m de altura", p.getNome(), p.calcularIdade(p.getAnoNascimento(), p.getMesNascimento(), p.getDiaNascimento()), p.getAltura());

    }
}