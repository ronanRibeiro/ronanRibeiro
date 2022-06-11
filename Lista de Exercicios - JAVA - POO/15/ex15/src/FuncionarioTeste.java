/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 15 - Crie uma classe chamada Funcionário que inclui três atributos:
    a. nome (String);
    b. sobrenome (String);
    c. salário mensal (double). 
A classe deve ter um construtor, métodos getters e setters para cada atributo da classe. Escreva uma classe 
chamada FuncionarioTeste (que contenha o método main) que cria dois objetos da classe Funcionario e 
exibe o salário de cada objeto. Então dê a cada Funcionario um aumento de 10% e exiba novamente o salário anual 
de cada um deles. Introduza na classe Funcionario uma variável de classe capaz de 
contabilizar o numero de funcionarios que passaram pela empresa até a data.
*/

public class FuncionarioTeste {
    public static void main(String[] args) throws Exception {

        Funcionario f1 = new Funcionario("Joao", "Silva", 1200.0);
        Funcionario f2 = new Funcionario("Maria", "Santos", 1500.0);

        System.out.printf("\n%s %s recebe %.2fR$ mensalmente.", f1.getNome(), f1.getSobrenome(), f1.getSalario());
        System.out.printf("\n%s %s recebe %.2fR$ mensalmente.", f2.getNome(), f2.getSobrenome(), f2.getSalario());

        System.out.printf("\nApós o aumento, %s %s receberá %.2fR$ anualmente.", f1.getNome(), f1.getSobrenome(), f1.getSalario()*1.1*12);
        System.out.printf("\nApós o aumento, %s %s receberá %.2fR$ anualmente.", f2.getNome(), f2.getSobrenome(), f2.getSalario()*1.1*12);

        System.out.printf("\nQuantidade total de funcionários que passaram: %d", f2.getQntdFuncionarios());
    }
}
