public class Funcionario {
    //Variaveis
    String nome;
    String sobremome;
    double salario;
    
    //Getters and Setters

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobremome() {
        return this.sobremome;
    }

    public void setSobremome(String sobremome) {
        this.sobremome = sobremome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Construtor
    public Funcionario(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobremome = sobrenome;
        if (salario < 0) {
            this.salario = 0;
        } else {
            this.salario = salario;
        }
    }
}
