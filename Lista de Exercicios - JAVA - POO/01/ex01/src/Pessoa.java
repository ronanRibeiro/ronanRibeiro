import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    //Datas Variaveis
    private String nome;
    private int anoNascimento;
    private int mesNascimento;
    private int diaNascimento;
    private float altura; 

    //Getters and Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getMesNascimento() {
        return this.mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getDiaNascimento() {
        return this.diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    //Calcular a Idade
    public int calcularIdade(int anoNascimento, int mesNascimento, int diaNascimento) {
        return Period.between(LocalDate.of(anoNascimento, mesNascimento, diaNascimento), LocalDate.now()).getYears();
    }
}
