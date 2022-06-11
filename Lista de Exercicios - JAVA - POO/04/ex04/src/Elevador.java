public class Elevador {
    
    //Variaveis
    int andarAtual;
    int ultimoAndar;    
    int pessoas;
    int capacidade;

    //getters and setters

    public int getAndarAtual() {
        return this.andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getUltimoAndar() {
        return this.ultimoAndar;
    }

    public void setUltimoAndar(int ultimoAndar) {
        this.ultimoAndar = ultimoAndar;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoas() {
        return this.pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    //Métodos
    public void inicializa (int ultimoAndar, int capacidade) {
        setUltimoAndar(ultimoAndar);
        setCapacidade(capacidade);
    }

    public void sobe (int sobe) {
        this.andarAtual = andarAtual + sobe;
    }

    public void desce (int desce) {
        this.andarAtual = andarAtual - desce; 
    }

    public void entra (int entra) {
        this.pessoas = pessoas + entra; 
    }

    public void sai (int sai) {
        this.pessoas = pessoas - sai;
    }

}
