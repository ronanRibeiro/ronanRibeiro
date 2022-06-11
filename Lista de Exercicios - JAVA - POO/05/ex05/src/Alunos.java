public class Alunos {
    //Variáveis
    private String matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double notaTrabalho;

    //Getters e Setters
    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return this.nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNotaTrabalho() {
        return this.notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }


    //Métodos
    public double mediaFinal (double nota1, double nota2, double notaTrabalho) {
        return (nota1*2.5 + nota2*2.5 + notaTrabalho*2)/7;
    }

    public double notaFinal (double mediaFinal) {
        if (mediaFinal < 6) {
            return 12 - mediaFinal;
        } else {
            return 0;
        }
    }
}
