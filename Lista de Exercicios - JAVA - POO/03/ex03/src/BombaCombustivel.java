public class BombaCombustivel {
    
    //Variaveis
    String tipoCombustivel;
    float valorLitro;
    float quantidadeCombustivel;

    //Getters e Setter
    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public float getValorLitro() {
        return this.valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public float getQuantidadeCombustivel() {
        return this.quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    //Métodos
    public float abastecerValor (float quantidadeReal) {
        return quantidadeReal/this.valorLitro;
    }

    public float abastecerLitro (float quantidadeLitro) {
        return quantidadeLitro*this.valorLitro;
    }
}
