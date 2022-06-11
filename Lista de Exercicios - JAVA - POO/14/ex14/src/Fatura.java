public class Fatura {
    //Variáveis
    private String numero;
    private String descricao;
    private int qntdComparada;
    private Double  precoItem;

    //Getters and Setters

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQntdComparada() {
        return this.qntdComparada;
    }

    public void setQntdComparada(int qntdComparada) {
        this.qntdComparada = qntdComparada;
    }

    public Double getPrecoItem() {
        return this.precoItem;
    }

    public void setPrecoItem(Double precoItem) {
        this.precoItem = precoItem;
    }

    //Construtor
    public Fatura(String numero, String descricao, int qntdComparada, Double precoItem) {
        this.numero = numero;
        this.descricao = descricao;
        if (qntdComparada < 0) {
            this.qntdComparada = 0;
        } else {
            this.qntdComparada = qntdComparada;
        }
        if (precoItem < 0) {
            this.precoItem = 0.0;
        } else {
            this.precoItem = precoItem;
        }        
    }

    //Métodos
    public Double getTotalFatura(){
        return getQntdComparada()*getPrecoItem();
    }
}
