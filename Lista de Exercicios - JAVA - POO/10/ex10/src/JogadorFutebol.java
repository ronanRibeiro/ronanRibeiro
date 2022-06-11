import java.time.LocalDate;
import java.time.Period;

public class JogadorFutebol {
    
    //Variaveis
    private String nome;
    private String posicao;
    private Data dataNascimento;
    private String nacionalidade;
    private float altura;
    private float peso;

    //Getters and Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return this.posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Data getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    //Cronstutor
    public JogadorFutebol(String nome, String posicao, Data dataNascimento, String nacionalidade, float altura, float peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    //Métodos
    public String dadosJogadores (){
        return "O jogador " + this.nome + " joga na " + this.posicao + " nasceu em " + this.dataNascimento.getData().format(dataNascimento.getFormato()) + " é " + this.nacionalidade + " tem " + this.altura + "m e pesa " + this.peso + "kg.";
    }

    public Period calcularIdade () {
        return Period.between( this.dataNascimento.getData(), LocalDate.now());
    }

    public Period tempoAposentar (String posicao) {
        if (posicao == "defesa") {
            return calcularIdade().minusYears(40);
        } else if (posicao == "meio-campo") {
            return calcularIdade().minusYears(38);
        } else {
            return calcularIdade().minusYears(35);
        }  
        
    }

}
