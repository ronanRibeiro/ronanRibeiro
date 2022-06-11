public class Funcionario {
    //Variáveis
    private String nome;
    private String sobrenome;
    private double salario;
    private static int qntdFuncionarios;

    //Getters and Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getQntdFuncionarios() {
        return qntdFuncionarios;
    }

    //Construtor
    public Funcionario(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        qntdFuncionarios++;
    }
}
