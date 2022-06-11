/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 07 - A fim de representar funcionários em uma empresa, crie uma classe chamada Funcionario que inclui as 
três informações a seguir como atributos:
a. um primeiro nome,
b. um sobrenome
c. um salário mensal
Sua classe deve ter um construtor que inicializa os três atributos. Forneça os métodos getters e setters para 
cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste 
que demonstra as capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de cada 
instância. Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada 
empregado.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o nome, o sobrenome e o salário mensal do primeiro funcionário:");
        Funcionario f1 = new Funcionario(leitorScanner.next(),leitorScanner.next(),leitorScanner.nextDouble());

        System.out.println("Digite o nome, o sobrenome e o salário mensal do segundo funcionário:");
        Funcionario f2 = new Funcionario(leitorScanner.next(),leitorScanner.next(),leitorScanner.nextDouble());
        
        leitorScanner.close();
        
        //Imprime o salario anual
        System.out.printf("\nO salário anual de %s %s é de: %.2f R$", f1.getNome(), f1.getSobremome(), f1.getSalario()*12); 
        System.out.printf("\nO salário anual de %s %s é de: %.2f R$", f2.getNome(), f2.getSobremome(), f2.getSalario()*12);

        //Aumento de 10% no salario
        f1.setSalario(f1.getSalario()*1.1);
        f2.setSalario(f2.getSalario()*1.1);

        // Imprime o salario anual com acrescimo de 10%
        System.out.printf("\nO salário anual de %s %s é de: %.2f R$", f1.getNome(), f1.getSobremome(), f1.getSalario()*12); 
        System.out.printf("\nO salário anual de %s %s é de: %.2f R$", f2.getNome(), f2.getSobremome(), f2.getSalario()*12);
    }
}
